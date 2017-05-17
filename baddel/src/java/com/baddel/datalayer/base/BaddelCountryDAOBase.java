package com.baddel.datalayer.base;

import com.baddel.datalayer.robocon.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.robocon.setting.handler.LoggingHandler;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class BaddelCountryDAOBase {

    public BaddelCountryDAOBase() {
    }

    public static List<BaddelCountry> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_country_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_country_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }


    public static List<BaddelCountry> searchBaddelCountry(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_country_search",whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_country_search",whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }

	 public static Integer selectCount(){
        try {
			return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_country_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
				return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_country_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID(){
        try {
	        return (Integer) DataAccessManager.queryForObject("baddel_country_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
		        return (Integer) DataAccessManager.queryForObject("baddel_country_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }
    
	  public static BaddelCountry selectById(Integer id)  {
		try {
			return (BaddelCountry) DataAccessManager.queryForObject("baddel_country_selectByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return (BaddelCountry) DataAccessManager.queryForObject("baddel_country_selectByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelCountry> selectByName(String name)  {
		try {
			return DataAccessManager.queryForList("baddel_country_selectByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_country_selectByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelCountry> selectByIso(String iso)  {
		try {
			return DataAccessManager.queryForList("baddel_country_selectByiso", iso);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_country_selectByiso", iso);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelCountry> selectByCurrencyid(Integer currencyid)  {
		try {
			return DataAccessManager.queryForList("baddel_country_selectBycurrencyid", currencyid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_country_selectBycurrencyid", currencyid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
  
    
	public static int deleteById(Integer id)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByName(String name)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByIso(String iso)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByiso", iso);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteByiso", iso);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByCurrencyid(Integer currencyid)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteBycurrencyid", currencyid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_country_deleteBycurrencyid", currencyid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
  		
    public static Integer insertSelective(BaddelCountry record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_country_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_country_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
    
    public static int updateByPrimaryKeySelective(BaddelCountry record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_country_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_country_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
}
