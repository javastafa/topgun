package com.baddel.datalayer.base;

import com.baddel.datalayer.robocon.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.robocon.setting.handler.LoggingHandler;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class TagsSettingsDAOBase {

    public TagsSettingsDAOBase() {
    }

    public static List<TagsSettings> selectAll() {
        try {
            return DataAccessManager.queryForList("tags_settings_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("tags_settings_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }


    public static List<TagsSettings> searchTagsSettings(String whereClause) {
        try {
            return DataAccessManager.queryForList("tags_settings_search",whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                return DataAccessManager.queryForList("tags_settings_search",whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return null;
            }
        }
    }

	 public static Integer selectCount(){
        try {
			return (Integer) DataAccessManager.sqlMapper.queryForObject("tags_settings_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
				return (Integer) DataAccessManager.sqlMapper.queryForObject("tags_settings_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID(){
        try {
	        return (Integer) DataAccessManager.queryForObject("tags_settings_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
		        return (Integer) DataAccessManager.queryForObject("tags_settings_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
                return 0;
            }
        }
    }
    
	  public static TagsSettings selectById(Integer id)  {
		try {
			return (TagsSettings) DataAccessManager.queryForObject("tags_settings_selectByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return (TagsSettings) DataAccessManager.queryForObject("tags_settings_selectByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<TagsSettings> selectByItemtype(Integer itemtype)  {
		try {
			return DataAccessManager.queryForList("tags_settings_selectByitemtype", itemtype);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("tags_settings_selectByitemtype", itemtype);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<TagsSettings> selectByTagname(String tagname)  {
		try {
			return DataAccessManager.queryForList("tags_settings_selectBytagname", tagname);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("tags_settings_selectBytagname", tagname);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<TagsSettings> selectByIscmstagged(Boolean iscmstagged)  {
		try {
			return DataAccessManager.queryForList("tags_settings_selectByiscmstagged", iscmstagged);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("tags_settings_selectByiscmstagged", iscmstagged);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
 
	  public static List<TagsSettings> selectByIsportaltagged(Boolean isportaltagged)  {
		try {
			return DataAccessManager.queryForList("tags_settings_selectByisportaltagged", isportaltagged);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				return DataAccessManager.queryForList("tags_settings_selectByisportaltagged", isportaltagged);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			return null;
		    }
		}
	   }
  
    
	public static int deleteById(Integer id)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByid", id);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByid", id);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByItemtype(Integer itemtype)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByitemtype", itemtype);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByitemtype", itemtype);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByTagname(String tagname)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteBytagname", tagname);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteBytagname", tagname);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByIscmstagged(Boolean iscmstagged)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByiscmstagged", iscmstagged);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByiscmstagged", iscmstagged);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
 
	public static int deleteByIsportaltagged(Boolean isportaltagged)  { 
		int rows = 0;
		try {
			rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByisportaltagged", isportaltagged);
		} catch (Exception ex) {
		    DataAccessManager.reloadSQLMap();
		    LoggingHandler.logError(2, "","first attemp ", ex);
		    try {
				rows = DataAccessManager.getSqlMapper().delete("tags_settings_deleteByisportaltagged", isportaltagged);
		    } catch (Exception exp) {
			LoggingHandler.logError(2, "","second attemp ", exp);
			
		    }
		}
		return rows;
	   }
  		
    public static Integer insertSelective(TagsSettings record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("tags_settings_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("tags_settings_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
    
    public static int updateByPrimaryKeySelective(TagsSettings record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("tags_settings_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "","first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("tags_settings_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "","second attemp ", exp);
            }
        }
        return rows;
    }
}
