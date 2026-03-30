<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdStoreRecord extends Model
{
    // 店铺ID
    /**
     * @example 01cc5d1cc0
     *
     * @var string
     */
    public $shopId;

    // 店铺名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $name;

    // 店铺地址
    /**
     * @example xxxx
     *
     * @var string
     */
    public $address;

    // 店铺所在省份
    /**
     * @example xxxx
     *
     * @var string
     */
    public $pname;

    // 店铺所在城市
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cityname;

    // 品牌id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $brandId;

    // 品牌名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $brandName;

    // 经销商代码
    /**
     * @example xxxx
     *
     * @var string
     */
    public $officeCode;

    // 经度
    /**
     * @example xxxx
     *
     * @var string
     */
    public $lon;

    // 纬度
    /**
     * @example xxxx
     *
     * @var string
     */
    public $lat;

    // 店铺数据版本集合
    /**
     * @example
     *
     * @var string[]
     */
    public $versionList;
    protected $_name = [
        'shopId'      => 'shop_id',
        'name'        => 'name',
        'address'     => 'address',
        'pname'       => 'pname',
        'cityname'    => 'cityname',
        'brandId'     => 'brand_id',
        'brandName'   => 'brand_name',
        'officeCode'  => 'office_code',
        'lon'         => 'lon',
        'lat'         => 'lat',
        'versionList' => 'version_list',
    ];

    public function validate()
    {
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('pname', $this->pname, true);
        Model::validateRequired('cityname', $this->cityname, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('brandName', $this->brandName, true);
        Model::validateRequired('officeCode', $this->officeCode, true);
        Model::validateRequired('lon', $this->lon, true);
        Model::validateRequired('lat', $this->lat, true);
        Model::validateRequired('versionList', $this->versionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->pname) {
            $res['pname'] = $this->pname;
        }
        if (null !== $this->cityname) {
            $res['cityname'] = $this->cityname;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->officeCode) {
            $res['office_code'] = $this->officeCode;
        }
        if (null !== $this->lon) {
            $res['lon'] = $this->lon;
        }
        if (null !== $this->lat) {
            $res['lat'] = $this->lat;
        }
        if (null !== $this->versionList) {
            $res['version_list'] = $this->versionList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdStoreRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['pname'])) {
            $model->pname = $map['pname'];
        }
        if (isset($map['cityname'])) {
            $model->cityname = $map['cityname'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['office_code'])) {
            $model->officeCode = $map['office_code'];
        }
        if (isset($map['lon'])) {
            $model->lon = $map['lon'];
        }
        if (isset($map['lat'])) {
            $model->lat = $map['lat'];
        }
        if (isset($map['version_list'])) {
            if (!empty($map['version_list'])) {
                $model->versionList = $map['version_list'];
            }
        }

        return $model;
    }
}
