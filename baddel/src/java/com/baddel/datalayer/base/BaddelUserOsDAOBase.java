package com.baddel.datalayer.base;

import com.baddel.datalayer.robocon.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.robocon.setting.handler.LoggingHandler;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class BaddelUserOsDAOBase {

    public BaddelUserOsDAOBase() {
    }

    public static List<BaddelUserOs> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_user_os_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_user_os_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }


    public static List<BaddelUserOs> searchBaddelUserOs(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_user_os_search",whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_user_os_search",whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }

	 public static Integer selectCount(){
        try {
			return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_user_os_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
				return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_user_os_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID(){
        try {
	        return (Integer) DataAccessManager.queryForObject("baddel_user_os_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
		        return (Integer) DataAccessManager.queryForObject("baddel_user_os_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }
    
	  public static BaddelUserOs selectById(Integer id)  {
		try {
			return (BaddelUserOs) DataAccessManager.queryForObject("baddel_user_os_selectByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return (BaddelUserOs) DataAccessManager.queryForObject("baddel_user_os_selectByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelUserOs> selectByName(String name)  {
		try {
			return DataAccessManager.queryForList("baddel_user_os_selectByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_user_os_selectByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
  
    
	public static int deleteById(Integer id)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_os_deleteByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_os_deleteByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByName(String name)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_os_deleteByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_os_deleteByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
  		
    public static Integer insertSelective(BaddelUserOs record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_user_os_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_user_os_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
    
    public static int updateByPrimaryKeySelective(BaddelUserOs record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_user_os_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_user_os_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
}
