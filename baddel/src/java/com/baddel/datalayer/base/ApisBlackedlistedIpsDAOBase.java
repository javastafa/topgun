package com.baddel.datalayer.base;

import com.baddel.datalayer.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.baddel.setting.handler.LoggingHandler;
import java.sql.Timestamp;
import java.util.List;

public class ApisBlackedlistedIpsDAOBase {

    public ApisBlackedlistedIpsDAOBase() {
    }

    public static List<ApisBlackedlistedIps> selectAll() {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> searchApisBlackedlistedIps(String whereClause) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_search", whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_search", whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static Integer selectCount() {
        try {
            return (Integer) DataAccessManager.sqlMapper.queryForObject("apis_blackedlisted_ips_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.sqlMapper.queryForObject("apis_blackedlisted_ips_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID() {
        try {
            return (Integer) DataAccessManager.queryForObject("apis_blackedlisted_ips_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.queryForObject("apis_blackedlisted_ips_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static ApisBlackedlistedIps selectById(Integer id) {
        try {
            return (ApisBlackedlistedIps) DataAccessManager.queryForObject("apis_blackedlisted_ips_selectByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (ApisBlackedlistedIps) DataAccessManager.queryForObject("apis_blackedlisted_ips_selectByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> selectByIp(String ip) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByip", ip);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByip", ip);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> selectByBlockingtype(Integer blockingtype) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByblockingtype", blockingtype);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByblockingtype", blockingtype);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> selectByBlockingreason(String blockingreason) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByblockingreason", blockingreason);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByblockingreason", blockingreason);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> selectByCreated(Timestamp created) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectBycreated", created);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectBycreated", created);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<ApisBlackedlistedIps> selectByUpdated(Timestamp updated) {
        try {
            return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByupdated", updated);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("apis_blackedlisted_ips_selectByupdated", updated);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static int deleteById(Integer id) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByIp(String ip) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByip", ip);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByip", ip);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByBlockingtype(Integer blockingtype) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByblockingtype", blockingtype);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByblockingtype", blockingtype);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByBlockingreason(String blockingreason) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByblockingreason", blockingreason);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByblockingreason", blockingreason);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByCreated(Timestamp created) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteBycreated", created);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteBycreated", created);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByUpdated(Timestamp updated) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByupdated", updated);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("apis_blackedlisted_ips_deleteByupdated", updated);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static Integer insertSelective(ApisBlackedlistedIps record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("apis_blackedlisted_ips_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("apis_blackedlisted_ips_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }

    public static int updateByPrimaryKeySelective(ApisBlackedlistedIps record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("apis_blackedlisted_ips_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("apis_blackedlisted_ips_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }
}
