CREATE DATABASE lending DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

-- CREATE TABLE `newdata` (
--   `id` bigint(20) NOT NULL,
--   `zaa` varchar(60) DEFAULT NULL,
--   `zab` varchar(60) DEFAULT NULL,
--   `zac` varchar(60) DEFAULT NULL,
--   `zad` varchar(60) DEFAULT NULL,
--   `zae` varchar(60) DEFAULT NULL,
--   `zaf` varchar(60) DEFAULT NULL,
--   `zag` varchar(60) DEFAULT NULL,
--   `zah` varchar(60) DEFAULT NULL,
--   `zai` varchar(60) DEFAULT NULL,
--   `zaj` varchar(60) DEFAULT NULL,
--   `zak` varchar(60) DEFAULT NULL,
--   `zal` varchar(60) DEFAULT NULL,
--   `zam` varchar(60) DEFAULT NULL,
--   `zan` varchar(60) DEFAULT NULL,
--   `zao` varchar(60) DEFAULT NULL,
--   `zap` varchar(60) DEFAULT NULL,
--   `zaq` varchar(60) DEFAULT NULL,
--   `zar` varchar(60) DEFAULT NULL,
--   `zas` varchar(60) DEFAULT NULL,
--   `zat` varchar(60) DEFAULT NULL,
--   `zau` varchar(60) DEFAULT NULL,
--   `zav` varchar(60) DEFAULT NULL,
--   `zaw` varchar(60) DEFAULT NULL,
--   `zax` varchar(60) DEFAULT NULL,
--   `zay` varchar(60) DEFAULT NULL,
--   `zaz` varchar(60) DEFAULT NULL,
--   `zba` varchar(60) DEFAULT NULL,
--   `zbb` varchar(60) DEFAULT NULL,
--   `zbc` varchar(60) DEFAULT NULL,
--   `zbd` varchar(60) DEFAULT NULL,
--   `zbe` varchar(60) DEFAULT NULL,
--   `zbf` varchar(60) DEFAULT NULL,
--   `zbg` varchar(60) DEFAULT NULL,
--   `zbh` varchar(60) DEFAULT NULL,
--   `zbi` varchar(60) DEFAULT NULL,
--   `zbj` varchar(60) DEFAULT NULL,
--   `zbk` varchar(60) DEFAULT NULL,
--   `zbl` varchar(60) DEFAULT NULL,
--   `zbm` varchar(60) DEFAULT NULL,
--   `zbn` varchar(60) DEFAULT NULL,
--   `zbo` varchar(60) DEFAULT NULL,
--   `zbp` varchar(60) DEFAULT NULL,
--   `zbq` varchar(60) DEFAULT NULL,
--   `zbr` varchar(60) DEFAULT NULL,
--   `zbs` varchar(60) DEFAULT NULL,
--   `zbt` varchar(60) DEFAULT NULL,
--   `zbu` varchar(60) DEFAULT NULL,
--   `zbv` varchar(60) DEFAULT NULL,
--   `zbw` varchar(60) DEFAULT NULL,
--   `zbx` varchar(60) DEFAULT NULL,
--   `zby` varchar(60) DEFAULT NULL,
--   `zbz` varchar(60) DEFAULT NULL,
--   `zca` varchar(60) DEFAULT NULL,
--   `zcb` varchar(60) DEFAULT NULL,
--   `zcc` varchar(60) DEFAULT NULL,
--   `zcd` varchar(60) DEFAULT NULL,
--   `zce` varchar(60) DEFAULT NULL,
--   `zcf` varchar(60) DEFAULT NULL,
--   `zcg` varchar(60) DEFAULT NULL,
--   `zch` varchar(60) DEFAULT NULL,
--   `zci` varchar(60) DEFAULT NULL,
--   `zcj` varchar(60) DEFAULT NULL,
--   `zck` varchar(60) DEFAULT NULL,
--   `zcl` varchar(60) DEFAULT NULL,
--   `zcm` varchar(60) DEFAULT NULL,
--   `zcn` varchar(60) DEFAULT NULL,
--   `zco` varchar(60) DEFAULT NULL,
--   `zcp` varchar(60) DEFAULT NULL,
--   `zcq` varchar(60) DEFAULT NULL,
--   `zcr` varchar(60) DEFAULT NULL,
--   `zcs` varchar(60) DEFAULT NULL,
--   `zct` varchar(60) DEFAULT NULL,
--   `zcu` varchar(60) DEFAULT NULL,
--   `zcv` varchar(60) DEFAULT NULL,
--   `zcw` varchar(60) DEFAULT NULL,
--   `zcx` varchar(60) DEFAULT NULL,
--   `zcy` varchar(60) DEFAULT NULL,
--   `zcz` varchar(60) DEFAULT NULL,
--   `zda` varchar(60) DEFAULT NULL,
--   `zdb` varchar(60) DEFAULT NULL,
--   `zdc` varchar(60) DEFAULT NULL,
--   `zdd` varchar(60) DEFAULT NULL,
--   `zde` varchar(60) DEFAULT NULL,
--   `zdf` varchar(60) DEFAULT NULL,
--   `zdg` varchar(60) DEFAULT NULL,
--   `zdh` varchar(60) DEFAULT NULL,
--   `zdi` varchar(60) DEFAULT NULL,
--   `zdj` varchar(60) DEFAULT NULL,
--   `zdk` varchar(60) DEFAULT NULL,
--   `zdl` varchar(60) DEFAULT NULL,
--   `zdm` varchar(60) DEFAULT NULL,
--   `zdn` varchar(60) DEFAULT NULL,
--   `zdo` varchar(60) DEFAULT NULL,
--   `zdp` varchar(60) DEFAULT NULL,
--   `zdq` varchar(60) DEFAULT NULL,
--   `zdr` varchar(60) DEFAULT NULL,
--   `zds` varchar(60) DEFAULT NULL,
--   `zdt` varchar(60) DEFAULT NULL,
--   `zdu` varchar(60) DEFAULT NULL,
--   `zdv` varchar(60) DEFAULT NULL,
--   `zdw` varchar(60) DEFAULT NULL,
--   `zdx` varchar(60) DEFAULT NULL,
--   `zdy` varchar(60) DEFAULT NULL,
--   `zdz` varchar(60) DEFAULT NULL,
--   `zea` varchar(60) DEFAULT NULL,
--   `zeb` varchar(60) DEFAULT NULL,
--   `zec` varchar(60) DEFAULT NULL,
--   `zed` varchar(60) DEFAULT NULL,
--   `zee` varchar(60) DEFAULT NULL,
--   `zef` varchar(60) DEFAULT NULL,
--   `zeg` varchar(60) DEFAULT NULL,
--   `zeh` varchar(60) DEFAULT NULL,
--   `zei` varchar(60) DEFAULT NULL,
--   `zej` varchar(60) DEFAULT NULL,
--   `zek` varchar(60) DEFAULT NULL,
--   `zel` varchar(60) DEFAULT NULL,
--   `zem` varchar(60) DEFAULT NULL,
--   `zen` varchar(60) DEFAULT NULL,
--   `zeo` varchar(60) DEFAULT NULL,
--   `adviseloan` varchar(60) DEFAULT NULL,
--   `adviseratio` varchar(60) DEFAULT NULL,
--   `creditgrade` varchar(60) DEFAULT NULL,
--   `badratio` varchar(60) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- CREATE TABLE `lgd` (
--   `id` bigint(20) NOT NULL,
--   `applid` varchar(60) DEFAULT NULL,
--   `amout10000` varchar(60) DEFAULT NULL,
--   `amout20000` varchar(60) DEFAULT NULL,
--   `amout30000` varchar(60) DEFAULT NULL,
--   `amout40000` varchar(60) DEFAULT NULL,
--   `amout50000` varchar(60) DEFAULT NULL,
--   `amout60000` varchar(60) DEFAULT NULL,
--   `amout70000` varchar(60) DEFAULT NULL,
--   `amout80000` varchar(60) DEFAULT NULL,
--   `amout90000` varchar(60) DEFAULT NULL,
--   `amout100000` varchar(60) DEFAULT NULL,
--   `amout110000` varchar(60) DEFAULT NULL,
--   `amout120000` varchar(60) DEFAULT NULL,
--   `amout130000` varchar(60) DEFAULT NULL,
--   `amout140000` varchar(60) DEFAULT NULL,
--   `amout150000` varchar(60) DEFAULT NULL,
--   `amout160000` varchar(60) DEFAULT NULL,
--   `amout170000` varchar(60) DEFAULT NULL,
--   `amout180000` varchar(60) DEFAULT NULL,
--   `amout190000` varchar(60) DEFAULT NULL,
--   `amout200000` varchar(60) DEFAULT NULL,
--   `amout210000` varchar(60) DEFAULT NULL,
--   `amout220000` varchar(60) DEFAULT NULL,
--   `amout230000` varchar(60) DEFAULT NULL,
--   `amout240000` varchar(60) DEFAULT NULL,
--   `amout250000` varchar(60) DEFAULT NULL,
--   `amout260000` varchar(60) DEFAULT NULL,
--   `amout270000` varchar(60) DEFAULT NULL,
--   `amout280000` varchar(60) DEFAULT NULL,
--   `amout290000` varchar(60) DEFAULT NULL,
--   `amout300000` varchar(60) DEFAULT NULL,
--   `amout310000` varchar(60) DEFAULT NULL,
--   `amout320000` varchar(60) DEFAULT NULL,
--   `amout330000` varchar(60) DEFAULT NULL,
--   `amout340000` varchar(60) DEFAULT NULL,
--   `amout350000` varchar(60) DEFAULT NULL,
--   `amout360000` varchar(60) DEFAULT NULL,
--   `amout370000` varchar(60) DEFAULT NULL,
--   `amout380000` varchar(60) DEFAULT NULL,
--   `amout390000` varchar(60) DEFAULT NULL,
--   `amout400000` varchar(60) DEFAULT NULL,
--   `amout410000` varchar(60) DEFAULT NULL,
--   `amout420000` varchar(60) DEFAULT NULL,
--   `amout430000` varchar(60) DEFAULT NULL,
--   `amout440000` varchar(60) DEFAULT NULL,
--   `amout450000` varchar(60) DEFAULT NULL,
--   `amout460000` varchar(60) DEFAULT NULL,
--   `amout470000` varchar(60) DEFAULT NULL,
--   `amout480000` varchar(60) DEFAULT NULL,
--   `amout490000` varchar(60) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- CREATE TABLE `risk` (
--   `id` bigint(20) NOT NULL,
--   `applid` varchar(60) DEFAULT NULL,
--   `a11` varchar(60) DEFAULT NULL,
--   `a12` varchar(60) DEFAULT NULL,
--   `a13` varchar(60) DEFAULT NULL,
--   `a14` varchar(60) DEFAULT NULL,
--   `a15` varchar(60) DEFAULT NULL,
--   `a16` varchar(60) DEFAULT NULL,
--   `a17` varchar(60) DEFAULT NULL,
--   `a18` varchar(60) DEFAULT NULL,
--   `a19` varchar(60) DEFAULT NULL,
--   `b11` varchar(60) DEFAULT NULL,
--   `b12` varchar(60) DEFAULT NULL,
--   `b13` varchar(60) DEFAULT NULL,
--   `b14` varchar(60) DEFAULT NULL,
--   `b15` varchar(60) DEFAULT NULL,
--   `b16` varchar(60) DEFAULT NULL,
--   `b17` varchar(60) DEFAULT NULL,
--   `b18` varchar(60) DEFAULT NULL,
--   `b19` varchar(60) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8