package com.baddel.datalayer.base;

import com.baddel.datalayer.DataAccessManager;
import com.baddel.datalayer.model.*;
import com.baddel.setting.handler.LoggingHandler;
import java.util.List;

public class BaddelCountriesCategoriesBrandsDAOBase {

    public BaddelCountriesCategoriesBrandsDAOBase() {
    }

    public static List<BaddelCountriesCategoriesBrands> selectAll() {
        try {
            return DataAccessManager.queryForList("baddel_countries_categories_brands_selectAll");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_countries_categories_brands_selectAll");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelCountriesCategoriesBrands> searchBaddelCountriesCategoriesBrands(String whereClause) {
        try {
            return DataAccessManager.queryForList("baddel_countries_categories_brands_search", whereClause);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_countries_categories_brands_search", whereClause);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static Integer selectCount() {
        try {
            return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_countries_categories_brands_count");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.sqlMapper.queryForObject("baddel_countries_categories_brands_count");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static Integer selectMaxID() {
        try {
            return (Integer) DataAccessManager.queryForObject("baddel_countries_categories_brands_max");
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (Integer) DataAccessManager.queryForObject("baddel_countries_categories_brands_max");
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return 0;
            }
        }
    }

    public static BaddelCountriesCategoriesBrands selectById(Integer id) {
        try {
            return (BaddelCountriesCategoriesBrands) DataAccessManager.queryForObject("baddel_countries_categories_brands_selectByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return (BaddelCountriesCategoriesBrands) DataAccessManager.queryForObject("baddel_countries_categories_brands_selectByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelCountriesCategoriesBrands> selectByCountrycategoryid(Integer countrycategoryid) {
        try {
            return DataAccessManager.queryForList("baddel_countries_categories_brands_selectBycountrycategoryid", countrycategoryid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_countries_categories_brands_selectBycountrycategoryid", countrycategoryid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static List<BaddelCountriesCategoriesBrands> selectByBrandid(Integer brandid) {
        try {
            return DataAccessManager.queryForList("baddel_countries_categories_brands_selectBybrandid", brandid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                return DataAccessManager.queryForList("baddel_countries_categories_brands_selectBybrandid", brandid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
                return null;
            }
        }
    }

    public static int deleteById(Integer id) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteByid", id);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteByid", id);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByCountrycategoryid(Integer countrycategoryid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteBycountrycategoryid", countrycategoryid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteBycountrycategoryid", countrycategoryid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static int deleteByBrandid(Integer brandid) {
        int rows = 0;
        try {
            rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteBybrandid", brandid);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.getSqlMapper().delete("baddel_countries_categories_brands_deleteBybrandid", brandid);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);

            }
        }
        return rows;
    }

    public static Integer insertSelective(BaddelCountriesCategoriesBrands record) {
        Integer rows = 0;
        try {
            rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_countries_categories_brands_insertSelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = (Integer) DataAccessManager.sqlMapper.insert("baddel_countries_categories_brands_insertSelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }

    public static int updateByPrimaryKeySelective(BaddelCountriesCategoriesBrands record) {
        int rows = 0;
        try {
            rows = DataAccessManager.sqlMapper.update("baddel_countries_categories_brands_updateByPrimaryKeySelective", record);
        } catch (Exception ex) {
            DataAccessManager.reloadSQLMap();
            LoggingHandler.logError(2, "", "first attemp ", ex);
            try {
                rows = DataAccessManager.sqlMapper.update("baddel_countries_categories_brands_updateByPrimaryKeySelective", record);
            } catch (Exception exp) {
                LoggingHandler.logError(2, "", "second attemp ", exp);
            }
        }
        return rows;
    }
}
