package com.baddel.datalayer.base;

import com.baddel.datalayer.robocon.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.robocon.setting.handler.LoggingHandler;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class BaddelUserLoginChannelsTokenDAOBase {

    public BaddelUserLoginChannelsTokenDAOBase() {
    }

    public static List<BaddelUserLoginChannelsToken> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_user_login_channels_token_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_user_login_channels_token_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }


    public static List<BaddelUserLoginChannelsToken> searchBaddelUserLoginChannelsToken(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_user_login_channels_token_search",whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_user_login_channels_token_search",whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }

	 public static Integer selectCount(){
        try {
			return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_user_login_channels_token_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
				return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_user_login_channels_token_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID(){
        try {
	        return (Integer) DataAccessManager.queryForObject("baddel_user_login_channels_token_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
		        return (Integer) DataAccessManager.queryForObject("baddel_user_login_channels_token_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }
    
	  public static BaddelUserLoginChannelsToken selectById(Integer id)  {
		try {
			return (BaddelUserLoginChannelsToken) DataAccessManager.queryForObject("baddel_user_login_channels_token_selectByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return (BaddelUserLoginChannelsToken) DataAccessManager.queryForObject("baddel_user_login_channels_token_selectByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelUserLoginChannelsToken> selectByUserid(Integer userid)  {
		try {
			return DataAccessManager.queryForList("baddel_user_login_channels_token_selectByuserid", userid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_user_login_channels_token_selectByuserid", userid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelUserLoginChannelsToken> selectByLoginchannelid(Integer loginchannelid)  {
		try {
			return DataAccessManager.queryForList("baddel_user_login_channels_token_selectByloginchannelid", loginchannelid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_user_login_channels_token_selectByloginchannelid", loginchannelid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<BaddelUserLoginChannelsToken> selectByToken(String token)  {
		try {
			return DataAccessManager.queryForList("baddel_user_login_channels_token_selectBytoken", token);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("baddel_user_login_channels_token_selectBytoken", token);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
  
    
	public static int deleteById(Integer id)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByUserid(Integer userid)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByuserid", userid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByuserid", userid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByLoginchannelid(Integer loginchannelid)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByloginchannelid", loginchannelid);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteByloginchannelid", loginchannelid);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByToken(String token)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteBytoken", token);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("baddel_user_login_channels_token_deleteBytoken", token);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
  		
    public static Integer insertSelective(BaddelUserLoginChannelsToken record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_user_login_channels_token_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_user_login_channels_token_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
    
    public static int updateByPrimaryKeySelective(BaddelUserLoginChannelsToken record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_user_login_channels_token_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_user_login_channels_token_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
}
