//package com.haocheng.study.springboot.mybatisplus;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.core.toolkit.StringPool;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * MP自动生成代码 —— V3.0.6
// *
// * @Author: haocheng
// * @Date: 2019-12-16 11:08
// */
//public class MpGenerator {
//    public static void main(String[] args) {
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//
//        // 数据源配置
//        DataSourceConfig dsConfig = new DataSourceConfig();
//        dsConfig.setDbType(DbType.MYSQL)
//                .setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&serverTimezone=UTC&useSSL=false")
//                .setUsername("root")
//                .setPassword("123456")
//                .setDriverName("com.mysql.cj.jdbc.Driver");
//
//        // 策略配置
//        StrategyConfig stConfig = new StrategyConfig();
//        stConfig.setCapitalMode(true)
//                //这里结合了Lombok，所以设置为true，如果没有集成Lombok，可以设置为false
//                .setEntityLombokModel(true)
//                .setNaming(NamingStrategy.underline_to_camel);
//        //这里因为我是多模块项目，所以需要加上子模块的名称，以便直接生成到该目录下，如果是单模块项目，可以将后面的去掉
////        String projectPath = System.getProperty("user.dir") + "/viboot-mybatis-plus";
//        String projectPath = System.getProperty("user.dir");
//        // 自定义配置
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//            }
//        };
//        // 如果模板引擎是 freemarker
//        String templatePath = "/templates/mapper.xml.ftl";
//        // 如果模板引擎是 velocity
//        // String templatePath = "/templates/mapper.xml.vm";
//
//        // 自定义输出配置
//        List<FileOutConfig> focList = new ArrayList<>();
//        // 自定义配置会被优先输出
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输出文件名
//                return projectPath + "/src/main/resources/mapper/" + "user"
//                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });
//
//        cfg.setFileOutConfigList(focList);
//
//        //设置作者，输出路径，是否重写等属性
//        gc.setActiveRecord(false)
//                .setEnableCache(false)
//                .setAuthor("haocheng")
//                .setOutputDir(projectPath + "/src/main/java")
//                .setFileOverride(true)
//                .setServiceName("%sService");
//        new AutoGenerator()
//                .setGlobalConfig(gc)
//                .setDataSource(dsConfig)
//                .setStrategy(stConfig)
//                .setTemplateEngine(new FreemarkerTemplateEngine())
//                .setCfg(cfg)
//                //这里进行包名的设置
//                .setPackageInfo(
//                        new PackageConfig()
//                                .setParent("com.haocheng.study.springboot.mybatisplus")
//                                .setController("controller")
//                                .setEntity("entity")
//                                .setMapper("mapper")
//                                .setServiceImpl("service.impl")
//                                .setService("service")
//                ).execute();
//    }
//}
