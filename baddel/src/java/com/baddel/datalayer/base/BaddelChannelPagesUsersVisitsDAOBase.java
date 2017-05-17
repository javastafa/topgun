package com.baddel.datalayer.base;

import com.baddel.datalayer.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.baddel.setting.handler.LoggingHandler;
import java.sql.Timestamp;
import java.util.List;

public class BaddelChannelPagesUsersVisitsDAOBase {

    public BaddelChannelPagesUsersVisitsDAOBase() {
    }

    public static List<BaddelChannelPagesUsersVisits> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelChannelPagesUsersVisits> searchBaddelChannelPagesUsersVisits(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_channel_pages_users_visits_search", whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_channel_pages_users_visits_search", whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static Integer selectCount() {
        try {
            return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_channel_pages_users_visits_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_channel_pages_users_visits_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID() {
        try {
            return (Integer) DataAccessManager.queryForObject("baddel_channel_pages_users_visits_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.queryForObject("baddel_channel_pages_users_visits_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static BaddelChannelPagesUsersVisits selectById(Integer id) {
        try {
            return (BaddelChannelPagesUsersVisits) DataAccessManager.queryForObject("baddel_channel_pages_users_visits_selectByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (BaddelChannelPagesUsersVisits) DataAccessManager.queryForObject("baddel_channel_pages_users_visits_selectByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelChannelPagesUsersVisits> selectByPageid(Integer pageid) {
        try {
            return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectBypageid", pageid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectBypageid", pageid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelChannelPagesUsersVisits> selectByUserid(Integer userid) {
        try {
            return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectByuserid", userid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectByuserid", userid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelChannelPagesUsersVisits> selectByVisittime(Timestamp visittime) {
        try {
            return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectByvisittime", visittime);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_channel_pages_users_visits_selectByvisittime", visittime);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static int deleteById(Integer id) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByPageid(Integer pageid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteBypageid", pageid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteBypageid", pageid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByUserid(Integer userid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByuserid", userid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByuserid", userid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByVisittime(Timestamp visittime) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByvisittime", visittime);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_channel_pages_users_visits_deleteByvisittime", visittime);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static Integer insertSelective(BaddelChannelPagesUsersVisits record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_channel_pages_users_visits_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_channel_pages_users_visits_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }

    public static int updateByPrimaryKeySelective(BaddelChannelPagesUsersVisits record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_channel_pages_users_visits_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_channel_pages_users_visits_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }
}
