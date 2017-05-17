package com.baddel.datalayer.base;

import com.baddel.datalayer.robocon.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.robocon.setting.handler.LoggingHandler;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class BaddelProductsDAOBase {

    public BaddelProductsDAOBase() {
    }

    public static List<BaddelProducts> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_products_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_products_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }


    public static List<BaddelProducts> searchBaddelProducts(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_products_search",whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_products_search",whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }

	 public static Integer selectCount(){
        try {
			return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_products_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
				return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_products_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID(){
        try {
	        return (Integer) DataAccessManager.queryForObject("baddel_products_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
		        return (Integer) DataAccessManager.queryForObject("baddel_products_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }
    
	  public static BaddelProducts selectById(Integer id)  {
		try {
			return (BaddelProducts) DataAccessManager.queryForObject("baddel_products_selectByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return (BaddelProducts) DataAccessManager.queryForObject("baddel_products_selectByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByName(String name)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByCountrycategorybrandid(Integer countrycategorybrandid)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectBycountrycategorybrandid", countrycategorybrandid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectBycountrycategorybrandid", countrycategorybrandid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByProductstatus(Integer productstatus)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectByproductstatus", productstatus);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectByproductstatus", productstatus);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByCreated(Timestamp created)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectBycreated", created);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectBycreated", created);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByUpdated(Timestamp updated)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectByupdated", updated);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectByupdated", updated);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByProductdescription(String productdescription)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectByproductdescription", productdescription);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectByproductdescription", productdescription);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelProducts> selectByProductitemscount(Integer productitemscount)  {
		try {
			return DataAccessManager.queryForList("baddel_products_selectByproductitemscount", productitemscount);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_products_selectByproductitemscount", productitemscount);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
  
    
	public static int deleteById(Integer id)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByName(String name)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByname", name);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByname", name);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByCountrycategorybrandid(Integer countrycategorybrandid)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteBycountrycategorybrandid", countrycategorybrandid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteBycountrycategorybrandid", countrycategorybrandid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByProductstatus(Integer productstatus)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductstatus", productstatus);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductstatus", productstatus);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByCreated(Timestamp created)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteBycreated", created);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteBycreated", created);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByUpdated(Timestamp updated)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByupdated", updated);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByupdated", updated);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByProductdescription(String productdescription)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductdescription", productdescription);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductdescription", productdescription);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByProductitemscount(Integer productitemscount)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductitemscount", productitemscount);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_products_deleteByproductitemscount", productitemscount);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
  		
    public static Integer insertSelective(BaddelProducts record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_products_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_products_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
    
    public static int updateByPrimaryKeySelective(BaddelProducts record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_products_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_products_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
}
