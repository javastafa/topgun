package com.baddel.datalayer.base;

import com.baddel.datalayer.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.baddel.setting.handler.LoggingHandler;
import java.sql.Timestamp;
import java.util.List;

public class AuthUsersActionsLogDAOBase {

    public AuthUsersActionsLogDAOBase() {
    }

    public static List<AuthUsersActionsLog> selectAll() {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> searchAuthUsersActionsLog(String whereClause) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_search", whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_search", whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static Integer selectCount() {
        try {
            return (Integer) DataAccessManager.sqlMapper.queryForObject("auth_users_actions_log_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.sqlMapper.queryForObject("auth_users_actions_log_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID() {
        try {
            return (Integer) DataAccessManager.queryForObject("auth_users_actions_log_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.queryForObject("auth_users_actions_log_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static AuthUsersActionsLog selectById(Integer id) {
        try {
            return (AuthUsersActionsLog) DataAccessManager.queryForObject("auth_users_actions_log_selectByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (AuthUsersActionsLog) DataAccessManager.queryForObject("auth_users_actions_log_selectByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByUserid(Integer userid) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectByuserid", userid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectByuserid", userid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByUsername(String username) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectByusername", username);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectByusername", username);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByActionid(Integer actionid) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectByactionid", actionid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectByactionid", actionid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByActiondate(Timestamp actiondate) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectByactiondate", actiondate);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectByactiondate", actiondate);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByDescription(String description) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectBydescription", description);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectBydescription", description);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<AuthUsersActionsLog> selectByIp(String ip) {
        try {
            return DataAccessManager.queryForList("auth_users_actions_log_selectByip", ip);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("auth_users_actions_log_selectByip", ip);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static int deleteById(Integer id) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByUserid(Integer userid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByuserid", userid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByuserid", userid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByUsername(String username) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByusername", username);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByusername", username);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByActionid(Integer actionid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByactionid", actionid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByactionid", actionid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByActiondate(Timestamp actiondate) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByactiondate", actiondate);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByactiondate", actiondate);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByDescription(String description) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteBydescription", description);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteBydescription", description);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByIp(String ip) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByip", ip);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("auth_users_actions_log_deleteByip", ip);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static Integer insertSelective(AuthUsersActionsLog record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("auth_users_actions_log_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("auth_users_actions_log_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }

    public static int updateByPrimaryKeySelective(AuthUsersActionsLog record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("auth_users_actions_log_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("auth_users_actions_log_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }
}
