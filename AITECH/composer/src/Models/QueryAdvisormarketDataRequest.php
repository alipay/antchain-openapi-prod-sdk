<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryAdvisormarketDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type' => 'type',
        'region' => 'region',
        'brands' => 'brands',
        'names' => 'names',
        'startdate' => 'startdate',
        'enddate' => 'enddate',
        'mintimes' => 'mintimes',
        'maxtimes' => 'maxtimes',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->brands) {
            $res['brands'] = $this->brands;
        }
        if (null !== $this->names) {
            $res['names'] = $this->names;
        }
        if (null !== $this->startdate) {
            $res['startdate'] = $this->startdate;
        }
        if (null !== $this->enddate) {
            $res['enddate'] = $this->enddate;
        }
        if (null !== $this->mintimes) {
            $res['mintimes'] = $this->mintimes;
        }
        if (null !== $this->maxtimes) {
            $res['maxtimes'] = $this->maxtimes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAdvisormarketDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['brands'])){
            if(!empty($map['brands'])){
                $model->brands = $map['brands'];
            }
        }
        if(isset($map['names'])){
            if(!empty($map['names'])){
                $model->names = $map['names'];
            }
        }
        if(isset($map['startdate'])){
            $model->startdate = $map['startdate'];
        }
        if(isset($map['enddate'])){
            $model->enddate = $map['enddate'];
        }
        if(isset($map['mintimes'])){
            $model->mintimes = $map['mintimes'];
        }
        if(isset($map['maxtimes'])){
            $model->maxtimes = $map['maxtimes'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 查询类型STATION_LIST、STATION_DETAIL、REACHABLE_ROADS、VEHICLE_TYPE_DISTRIBUTION、ENTRY_FLOW、FRONT_FLOW、SURROUNDING_FLOW、NEW_ENTRY_VEHICLES、FREQUENT_ENTRY、INFREQUENT_ENTRY
    /**
     * @var string
     */
    public $type;

    // 行政区名称，如“浙江省”、“杭州市”；type=STATION_LIST时必填
    /**
     * @var string
     */
    public $region;

    // 品牌清单筛选，如 ["中石油", "中石化"]；不传则返回所有品牌；仅 type=STATION_LIST 时生效
    /**
     * @var string[]
     */
    public $brands;

    // 站点名称列表，支持批量查询；type 非 STATION_LIST 时必填
    /**
     * @var string[]
     */
    public $names;

    // 起始日期，yyyy-MM-dd；时间类查询时必填
    /**
     * @var string
     */
    public $startdate;

    // 结束日期，yyyy-MM-dd；时间类查询时必填
    /**
     * @var string
     */
    public $enddate;

    // 最低进站次数阈值，默认 3；仅 type=FREQUENT_ENTRY 时生效
    /**
     * @var string
     */
    public $mintimes;

    // 最高进站次数阈值（不含），默认 3；仅 type=INFREQUENT_ENTRY 时生效
    /**
     * @var string
     */
    public $maxtimes;

}
