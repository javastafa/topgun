package com.baddel.datalayer.base;

import com.baddel.datalayer.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.baddel.setting.handler.LoggingHandler;
import java.util.List;

public class ApisAuthDAOBase {

    public ApisAuthDAOBase() {
    }

    public static List<ApisAuth> selectAll() {
        try {
            return DataAccessManager.queryForList("apis_auth_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_auth_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisAuth> searchApisAuth(String whereClause) {
        try {
            return DataAccessManager.queryForList("apis_auth_search", whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_auth_search", whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static Integer selectCount() {
        try {
            return (Integer) DataAccessManager.sqlMapper.queryForObject("apis_auth_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.sqlMapper.queryForObject("apis_auth_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID() {
        try {
            return (Integer) DataAccessManager.queryForObject("apis_auth_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.queryForObject("apis_auth_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static ApisAuth selectById(Integer id) {
        try {
            return (ApisAuth) DataAccessManager.queryForObject("apis_auth_selectByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (ApisAuth) DataAccessManager.queryForObject("apis_auth_selectByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisAuth> selectByAuthKey(String authKey) {
        try {
            return DataAccessManager.queryForList("apis_auth_selectByauthKey", authKey);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_auth_selectByauthKey", authKey);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisAuth> selectByAuthValue(String authValue) {
        try {
            return DataAccessManager.queryForList("apis_auth_selectByauthValue", authValue);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_auth_selectByauthValue", authValue);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static int deleteById(Integer id) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByAuthKey(String authKey) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByauthKey", authKey);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByauthKey", authKey);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByAuthValue(String authValue) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByauthValue", authValue);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_auth_deleteByauthValue", authValue);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static Integer insertSelective(ApisAuth record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("apis_auth_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("apis_auth_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }

    public static int updateByPrimaryKeySelective(ApisAuth record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("apis_auth_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("apis_auth_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }
}
