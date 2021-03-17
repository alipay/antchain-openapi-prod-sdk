<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class House extends Model
{
    // 房屋所在区/县地区编码
    /**
     * @example 330108
     *
     * @var string
     */
    public $areaCode;

    // 是否有异议，Y-是，N-否
    /**
     * @example N
     *
     * @var string
     */
    public $claimed;

    // 是否有文件备案
    /**
     * @example N
     *
     * @var string
     */
    public $fileRecorded;

    // 产证编号
    /**
     * @example 浙xx第xx权证xxxx号
     *
     * @var string
     */
    public $houseCertNo;

    // 权证类型，比如：HOUSE_CERT=房屋所有权证
    /**
     * @example HOUSE_CERT
     *
     * @var string
     */
    public $houseCertType;

    // 房产编号
    /**
     * @example 2343413233
     *
     * @var string
     */
    public $houseCode;

    // 抵押信息列表
    /**
     * @example
     *
     * @var HouseMgInfo[]
     */
    public $houseMgInfos;

    // 房产编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseNo;

    // 产权人列表
    /**
     * @example
     *
     * @var HouseOwner[]
     */
    public $houseOwners;

    // 限制信息列表
    /**
     * @example
     *
     * @var HouseRestrictionInfo[]
     */
    public $houseRestrictionInfos;

    // 不动产单元号
    /**
     * @example 330102001003GB00055F00010312
     *
     * @var string
     */
    public $houseUnitCode;

    // 不动产单元号，待废弃字段
    /**
     * @example
     *
     * @var string[]
     */
    public $houseUnitCodes;

    // 隐形产权人列表
    /**
     * @example
     *
     * @var HouseOwner[]
     */
    public $invisibleHouseOwners;

    // 房屋所在地址信息
    /**
     * @example xx省xx市xx区xx街道xx路xx号
     *
     * @var string
     */
    public $location;

    // 是否有抵押，Y-是，N-否
    /**
     * @example N
     *
     * @var string
     */
    public $mortgaged;

    // 共有情况,比如：SHARE_COOWNER=共同共有
    /**
     * @example SHARE_COOWNER
     *
     * @var string
     */
    public $ownershipStatus;

    // 数据获取时间
    /**
     * @example 2020-08-12 00:23:32
     *
     * @var string
     */
    public $queryTime;

    // 用途,比如：HOUSE=住宅
    /**
     * @example HOUSE
     *
     * @var string
     */
    public $realtyUsage;

    // 是否有查封：Y-是，N-否
    /**
     * @example N
     *
     * @var string
     */
    public $seized;

    // 土地分摊面积
    /**
     * @example 10233.34
     *
     * @var string
     */
    public $sharingLandArea;

    // 土地分摊面积单位，比如：SQUARE_METER=平方米
    /**
     * @example SQUARE_METER
     *
     * @var string
     */
    public $sharingLandAreaUnit;

    // 当前产证归属的房产链产权人内部编号
    /**
     * @example 20200810001220100000000000000001
     *
     * @var string
     */
    public $houseOwnerCmNo;

    // 建筑面积
    /**
     * @example 120.23
     *
     * @var string
     */
    public $structureArea;

    // 建筑面积单位，比如：SQUARE_METER=平方米
    /**
     * @example SQUARE_METER
     *
     * @var string
     */
    public $structureAreaUnit;

    // 权利性质
    /**
     * @example 出让/存量房
     *
     * @var string
     */
    public $rightsNature;

    // 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
    /**
     * @example STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING
     *
     * @var string
     */
    public $rightsType;

    // 房屋性质,COMMERCIAL_HOUSING=商品房
    /**
     * @example COMMERCIAL_HOUSING
     *
     * @var string
     */
    public $houseNature;

    // 土地证号
    /**
     * @example 2334532323232
     *
     * @var string
     */
    public $landCertNo;

    // 土地用途
    /**
     * @example 住宅用地
     *
     * @var string
     */
    public $landUsage;

    // 土地性质,SELL=出让
    /**
     * @example SELL
     *
     * @var string
     */
    public $landNature;

    // 土地使用权开始日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $landUseStartDate;

    // 土地使用权终止日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $landUseEndDate;

    // 总层数
    /**
     * @example 30
     *
     * @var string
     */
    public $totalFloor;

    // 所在层
    /**
     * @example 23
     *
     * @var string
     */
    public $itsFloor;

    // 建造年份
    /**
     * @example 2020
     *
     * @var string
     */
    public $builtYear;

    // 登薄日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $regDate;

    // 证书附记备注
    /**
     * @example 证书附记备注
     *
     * @var string
     */
    public $certRemark;

    // 证书状态描述
    /**
     * @example 一般抵押（2次），查封限制（1次）
     *
     * @var string
     */
    public $certStatus;
    protected $_name = [
        'areaCode'              => 'area_code',
        'claimed'               => 'claimed',
        'fileRecorded'          => 'file_recorded',
        'houseCertNo'           => 'house_cert_no',
        'houseCertType'         => 'house_cert_type',
        'houseCode'             => 'house_code',
        'houseMgInfos'          => 'house_mg_infos',
        'houseNo'               => 'house_no',
        'houseOwners'           => 'house_owners',
        'houseRestrictionInfos' => 'house_restriction_infos',
        'houseUnitCode'         => 'house_unit_code',
        'houseUnitCodes'        => 'house_unit_codes',
        'invisibleHouseOwners'  => 'invisible_house_owners',
        'location'              => 'location',
        'mortgaged'             => 'mortgaged',
        'ownershipStatus'       => 'ownership_status',
        'queryTime'             => 'query_time',
        'realtyUsage'           => 'realty_usage',
        'seized'                => 'seized',
        'sharingLandArea'       => 'sharing_land_area',
        'sharingLandAreaUnit'   => 'sharing_land_area_unit',
        'houseOwnerCmNo'        => 'house_owner_cm_no',
        'structureArea'         => 'structure_area',
        'structureAreaUnit'     => 'structure_area_unit',
        'rightsNature'          => 'rights_nature',
        'rightsType'            => 'rights_type',
        'houseNature'           => 'house_nature',
        'landCertNo'            => 'land_cert_no',
        'landUsage'             => 'land_usage',
        'landNature'            => 'land_nature',
        'landUseStartDate'      => 'land_use_start_date',
        'landUseEndDate'        => 'land_use_end_date',
        'totalFloor'            => 'total_floor',
        'itsFloor'              => 'its_floor',
        'builtYear'             => 'built_year',
        'regDate'               => 'reg_date',
        'certRemark'            => 'cert_remark',
        'certStatus'            => 'cert_status',
    ];

    public function validate()
    {
        Model::validatePattern('queryTime', $this->queryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('landUseStartDate', $this->landUseStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('landUseEndDate', $this->landUseEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('regDate', $this->regDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }
        if (null !== $this->claimed) {
            $res['claimed'] = $this->claimed;
        }
        if (null !== $this->fileRecorded) {
            $res['file_recorded'] = $this->fileRecorded;
        }
        if (null !== $this->houseCertNo) {
            $res['house_cert_no'] = $this->houseCertNo;
        }
        if (null !== $this->houseCertType) {
            $res['house_cert_type'] = $this->houseCertType;
        }
        if (null !== $this->houseCode) {
            $res['house_code'] = $this->houseCode;
        }
        if (null !== $this->houseMgInfos) {
            $res['house_mg_infos'] = [];
            if (null !== $this->houseMgInfos && \is_array($this->houseMgInfos)) {
                $n = 0;
                foreach ($this->houseMgInfos as $item) {
                    $res['house_mg_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->houseNo) {
            $res['house_no'] = $this->houseNo;
        }
        if (null !== $this->houseOwners) {
            $res['house_owners'] = [];
            if (null !== $this->houseOwners && \is_array($this->houseOwners)) {
                $n = 0;
                foreach ($this->houseOwners as $item) {
                    $res['house_owners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->houseRestrictionInfos) {
            $res['house_restriction_infos'] = [];
            if (null !== $this->houseRestrictionInfos && \is_array($this->houseRestrictionInfos)) {
                $n = 0;
                foreach ($this->houseRestrictionInfos as $item) {
                    $res['house_restriction_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->houseUnitCode) {
            $res['house_unit_code'] = $this->houseUnitCode;
        }
        if (null !== $this->houseUnitCodes) {
            $res['house_unit_codes'] = $this->houseUnitCodes;
        }
        if (null !== $this->invisibleHouseOwners) {
            $res['invisible_house_owners'] = [];
            if (null !== $this->invisibleHouseOwners && \is_array($this->invisibleHouseOwners)) {
                $n = 0;
                foreach ($this->invisibleHouseOwners as $item) {
                    $res['invisible_house_owners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->mortgaged) {
            $res['mortgaged'] = $this->mortgaged;
        }
        if (null !== $this->ownershipStatus) {
            $res['ownership_status'] = $this->ownershipStatus;
        }
        if (null !== $this->queryTime) {
            $res['query_time'] = $this->queryTime;
        }
        if (null !== $this->realtyUsage) {
            $res['realty_usage'] = $this->realtyUsage;
        }
        if (null !== $this->seized) {
            $res['seized'] = $this->seized;
        }
        if (null !== $this->sharingLandArea) {
            $res['sharing_land_area'] = $this->sharingLandArea;
        }
        if (null !== $this->sharingLandAreaUnit) {
            $res['sharing_land_area_unit'] = $this->sharingLandAreaUnit;
        }
        if (null !== $this->houseOwnerCmNo) {
            $res['house_owner_cm_no'] = $this->houseOwnerCmNo;
        }
        if (null !== $this->structureArea) {
            $res['structure_area'] = $this->structureArea;
        }
        if (null !== $this->structureAreaUnit) {
            $res['structure_area_unit'] = $this->structureAreaUnit;
        }
        if (null !== $this->rightsNature) {
            $res['rights_nature'] = $this->rightsNature;
        }
        if (null !== $this->rightsType) {
            $res['rights_type'] = $this->rightsType;
        }
        if (null !== $this->houseNature) {
            $res['house_nature'] = $this->houseNature;
        }
        if (null !== $this->landCertNo) {
            $res['land_cert_no'] = $this->landCertNo;
        }
        if (null !== $this->landUsage) {
            $res['land_usage'] = $this->landUsage;
        }
        if (null !== $this->landNature) {
            $res['land_nature'] = $this->landNature;
        }
        if (null !== $this->landUseStartDate) {
            $res['land_use_start_date'] = $this->landUseStartDate;
        }
        if (null !== $this->landUseEndDate) {
            $res['land_use_end_date'] = $this->landUseEndDate;
        }
        if (null !== $this->totalFloor) {
            $res['total_floor'] = $this->totalFloor;
        }
        if (null !== $this->itsFloor) {
            $res['its_floor'] = $this->itsFloor;
        }
        if (null !== $this->builtYear) {
            $res['built_year'] = $this->builtYear;
        }
        if (null !== $this->regDate) {
            $res['reg_date'] = $this->regDate;
        }
        if (null !== $this->certRemark) {
            $res['cert_remark'] = $this->certRemark;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return House
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }
        if (isset($map['claimed'])) {
            $model->claimed = $map['claimed'];
        }
        if (isset($map['file_recorded'])) {
            $model->fileRecorded = $map['file_recorded'];
        }
        if (isset($map['house_cert_no'])) {
            $model->houseCertNo = $map['house_cert_no'];
        }
        if (isset($map['house_cert_type'])) {
            $model->houseCertType = $map['house_cert_type'];
        }
        if (isset($map['house_code'])) {
            $model->houseCode = $map['house_code'];
        }
        if (isset($map['house_mg_infos'])) {
            if (!empty($map['house_mg_infos'])) {
                $model->houseMgInfos = [];
                $n                   = 0;
                foreach ($map['house_mg_infos'] as $item) {
                    $model->houseMgInfos[$n++] = null !== $item ? HouseMgInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['house_no'])) {
            $model->houseNo = $map['house_no'];
        }
        if (isset($map['house_owners'])) {
            if (!empty($map['house_owners'])) {
                $model->houseOwners = [];
                $n                  = 0;
                foreach ($map['house_owners'] as $item) {
                    $model->houseOwners[$n++] = null !== $item ? HouseOwner::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['house_restriction_infos'])) {
            if (!empty($map['house_restriction_infos'])) {
                $model->houseRestrictionInfos = [];
                $n                            = 0;
                foreach ($map['house_restriction_infos'] as $item) {
                    $model->houseRestrictionInfos[$n++] = null !== $item ? HouseRestrictionInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['house_unit_code'])) {
            $model->houseUnitCode = $map['house_unit_code'];
        }
        if (isset($map['house_unit_codes'])) {
            if (!empty($map['house_unit_codes'])) {
                $model->houseUnitCodes = $map['house_unit_codes'];
            }
        }
        if (isset($map['invisible_house_owners'])) {
            if (!empty($map['invisible_house_owners'])) {
                $model->invisibleHouseOwners = [];
                $n                           = 0;
                foreach ($map['invisible_house_owners'] as $item) {
                    $model->invisibleHouseOwners[$n++] = null !== $item ? HouseOwner::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['mortgaged'])) {
            $model->mortgaged = $map['mortgaged'];
        }
        if (isset($map['ownership_status'])) {
            $model->ownershipStatus = $map['ownership_status'];
        }
        if (isset($map['query_time'])) {
            $model->queryTime = $map['query_time'];
        }
        if (isset($map['realty_usage'])) {
            $model->realtyUsage = $map['realty_usage'];
        }
        if (isset($map['seized'])) {
            $model->seized = $map['seized'];
        }
        if (isset($map['sharing_land_area'])) {
            $model->sharingLandArea = $map['sharing_land_area'];
        }
        if (isset($map['sharing_land_area_unit'])) {
            $model->sharingLandAreaUnit = $map['sharing_land_area_unit'];
        }
        if (isset($map['house_owner_cm_no'])) {
            $model->houseOwnerCmNo = $map['house_owner_cm_no'];
        }
        if (isset($map['structure_area'])) {
            $model->structureArea = $map['structure_area'];
        }
        if (isset($map['structure_area_unit'])) {
            $model->structureAreaUnit = $map['structure_area_unit'];
        }
        if (isset($map['rights_nature'])) {
            $model->rightsNature = $map['rights_nature'];
        }
        if (isset($map['rights_type'])) {
            $model->rightsType = $map['rights_type'];
        }
        if (isset($map['house_nature'])) {
            $model->houseNature = $map['house_nature'];
        }
        if (isset($map['land_cert_no'])) {
            $model->landCertNo = $map['land_cert_no'];
        }
        if (isset($map['land_usage'])) {
            $model->landUsage = $map['land_usage'];
        }
        if (isset($map['land_nature'])) {
            $model->landNature = $map['land_nature'];
        }
        if (isset($map['land_use_start_date'])) {
            $model->landUseStartDate = $map['land_use_start_date'];
        }
        if (isset($map['land_use_end_date'])) {
            $model->landUseEndDate = $map['land_use_end_date'];
        }
        if (isset($map['total_floor'])) {
            $model->totalFloor = $map['total_floor'];
        }
        if (isset($map['its_floor'])) {
            $model->itsFloor = $map['its_floor'];
        }
        if (isset($map['built_year'])) {
            $model->builtYear = $map['built_year'];
        }
        if (isset($map['reg_date'])) {
            $model->regDate = $map['reg_date'];
        }
        if (isset($map['cert_remark'])) {
            $model->certRemark = $map['cert_remark'];
        }
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }

        return $model;
    }
}
