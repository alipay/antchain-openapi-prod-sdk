// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 房产
    public class House : TeaModel {
        // 房屋所在区/县地区编码
        [NameInMap("area_code")]
        [Validation(Required=false)]
        public string AreaCode { get; set; }

        // 是否有异议，Y-是，N-否
        [NameInMap("claimed")]
        [Validation(Required=false)]
        public string Claimed { get; set; }

        // 是否有文件备案
        [NameInMap("file_recorded")]
        [Validation(Required=false)]
        public string FileRecorded { get; set; }

        // 产证编号
        [NameInMap("house_cert_no")]
        [Validation(Required=false)]
        public string HouseCertNo { get; set; }

        // 权证类型，比如：HOUSE_CERT=房屋所有权证
        [NameInMap("house_cert_type")]
        [Validation(Required=false)]
        public string HouseCertType { get; set; }

        // 房产编号
        [NameInMap("house_code")]
        [Validation(Required=false)]
        public string HouseCode { get; set; }

        // 抵押信息列表
        [NameInMap("house_mg_infos")]
        [Validation(Required=false)]
        public List<HouseMgInfo> HouseMgInfos { get; set; }

        // 房产编号
        [NameInMap("house_no")]
        [Validation(Required=false)]
        public string HouseNo { get; set; }

        // 产权人列表
        [NameInMap("house_owners")]
        [Validation(Required=false)]
        public List<HouseOwner> HouseOwners { get; set; }

        // 限制信息列表
        [NameInMap("house_restriction_infos")]
        [Validation(Required=false)]
        public List<HouseRestrictionInfo> HouseRestrictionInfos { get; set; }

        // 不动产单元号
        [NameInMap("house_unit_code")]
        [Validation(Required=false)]
        public string HouseUnitCode { get; set; }

        // 不动产单元号，待废弃字段
        [NameInMap("house_unit_codes")]
        [Validation(Required=false)]
        public List<string> HouseUnitCodes { get; set; }

        // 隐形产权人列表
        [NameInMap("invisible_house_owners")]
        [Validation(Required=false)]
        public List<HouseOwner> InvisibleHouseOwners { get; set; }

        // 房屋所在地址信息
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 是否有抵押，Y-是，N-否
        [NameInMap("mortgaged")]
        [Validation(Required=false)]
        public string Mortgaged { get; set; }

        // 共有情况,比如：SHARE_COOWNER=共同共有
        [NameInMap("ownership_status")]
        [Validation(Required=false)]
        public string OwnershipStatus { get; set; }

        // 数据获取时间
        [NameInMap("query_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string QueryTime { get; set; }

        // 用途,比如：HOUSE=住宅
        [NameInMap("realty_usage")]
        [Validation(Required=false)]
        public string RealtyUsage { get; set; }

        // 是否有查封：Y-是，N-否
        [NameInMap("seized")]
        [Validation(Required=false)]
        public string Seized { get; set; }

        // 土地分摊面积
        [NameInMap("sharing_land_area")]
        [Validation(Required=false)]
        public string SharingLandArea { get; set; }

        // 土地分摊面积单位，比如：SQUARE_METER=平方米
        [NameInMap("sharing_land_area_unit")]
        [Validation(Required=false)]
        public string SharingLandAreaUnit { get; set; }

        // 当前产证归属的房产链产权人内部编号
        [NameInMap("house_owner_cm_no")]
        [Validation(Required=false)]
        public string HouseOwnerCmNo { get; set; }

        // 建筑面积
        [NameInMap("structure_area")]
        [Validation(Required=false)]
        public string StructureArea { get; set; }

        // 建筑面积单位，比如：SQUARE_METER=平方米
        [NameInMap("structure_area_unit")]
        [Validation(Required=false)]
        public string StructureAreaUnit { get; set; }

        // 权利性质
        [NameInMap("rights_nature")]
        [Validation(Required=false)]
        public string RightsNature { get; set; }

        // 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
        [NameInMap("rights_type")]
        [Validation(Required=false)]
        public string RightsType { get; set; }

        // 房屋性质,COMMERCIAL_HOUSING=商品房
        [NameInMap("house_nature")]
        [Validation(Required=false)]
        public string HouseNature { get; set; }

        // 土地证号
        [NameInMap("land_cert_no")]
        [Validation(Required=false)]
        public string LandCertNo { get; set; }

        // 土地用途
        [NameInMap("land_usage")]
        [Validation(Required=false)]
        public string LandUsage { get; set; }

        // 土地性质,SELL=出让
        [NameInMap("land_nature")]
        [Validation(Required=false)]
        public string LandNature { get; set; }

        // 土地使用权开始日期
        [NameInMap("land_use_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LandUseStartDate { get; set; }

        // 土地使用权终止日期
        [NameInMap("land_use_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LandUseEndDate { get; set; }

        // 总层数
        [NameInMap("total_floor")]
        [Validation(Required=false)]
        public string TotalFloor { get; set; }

        // 所在层
        [NameInMap("its_floor")]
        [Validation(Required=false)]
        public string ItsFloor { get; set; }

        // 建造年份
        [NameInMap("built_year")]
        [Validation(Required=false)]
        public string BuiltYear { get; set; }

        // 登薄日期
        [NameInMap("reg_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RegDate { get; set; }

        // 证书附记备注
        [NameInMap("cert_remark")]
        [Validation(Required=false)]
        public string CertRemark { get; set; }

        // 证书状态描述
        [NameInMap("cert_status")]
        [Validation(Required=false)]
        public string CertStatus { get; set; }

    }

}
