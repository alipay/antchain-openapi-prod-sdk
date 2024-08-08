<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ImportYhllRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // shopUuid
    /**
     * @var string
     */
    public $shopUuid;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 任务类型
    /**
     * @var string
     */
    public $goodType;

    // 模板名
    /**
     * @var string
     */
    public $templateName;

    // 行业
    /**
     * @var string
     */
    public $industry;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 城市代码
    /**
     * @var string
     */
    public $cityCode;

    // 经度
    /**
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @var string
     */
    public $latitude;

    // 坐标范围
    /**
     * @var string
     */
    public $coordinateRange;

    // 总量
    /**
     * @var int
     */
    public $total;

    // 模板替换符
    /**
     * @var string
     */
    public $placeHolder;

    // 补充信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'shopUuid'          => 'shop_uuid',
        'name'              => 'name',
        'description'       => 'description',
        'goodType'          => 'good_type',
        'templateName'      => 'template_name',
        'industry'          => 'industry',
        'address'           => 'address',
        'cityCode'          => 'city_code',
        'longitude'         => 'longitude',
        'latitude'          => 'latitude',
        'coordinateRange'   => 'coordinate_range',
        'total'             => 'total',
        'placeHolder'       => 'place_holder',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('shopUuid', $this->shopUuid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('goodType', $this->goodType, true);
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('total', $this->total, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->shopUuid) {
            $res['shop_uuid'] = $this->shopUuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->goodType) {
            $res['good_type'] = $this->goodType;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->coordinateRange) {
            $res['coordinate_range'] = $this->coordinateRange;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->placeHolder) {
            $res['place_holder'] = $this->placeHolder;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportYhllRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['shop_uuid'])) {
            $model->shopUuid = $map['shop_uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['good_type'])) {
            $model->goodType = $map['good_type'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['coordinate_range'])) {
            $model->coordinateRange = $map['coordinate_range'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['place_holder'])) {
            $model->placeHolder = $map['place_holder'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
