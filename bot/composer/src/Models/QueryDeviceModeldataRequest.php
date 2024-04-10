<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceModeldataRequest extends Model
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

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 签名
    /**
     * @var string
     */
    public $signature;

    // 数据类型
    // HOT_STORAGE：时序数据
    // ORIGINAL_PROPERTY：原始属性
    // ORIGINAL_EVENT：原始事件
    // ORIGINAL_SERVICE：原始服务
    /**
     * @var string
     */
    public $dataType;

    // 返回结果中数据记录的排序方式，取值：
    // ● true：正序。
    // ● false：倒序。
    /**
     * @var bool
     */
    public $asc;

    // 要查询的数据记录的开始时间，必须小于结束时间EndTime。
    /**
     * @var int
     */
    public $startTime;

    // 要查询的数据记录的结束时间，必须大于起始时间StartTime。
    /**
     * @var int
     */
    public $endTime;

    // 标识符，不同的datatype意思不同
    // HOT_STORAGE：已存储时序数据中的字段标识符。
    // ORIGINAL_PROPERTY：属性标识符
    // ORIGINAL_EVENT：事件标识符
    // ORIGINAL_SERVICE：服务标识符
    /**
     * @var string
     */
    public $identifier;

    // 单个字段标识符可返回的数据记录数量，最大值为100。
    // 任意一个字段返回的数据记录数量均不超过该值。
    /**
     * @var int
     */
    public $pageSize;

    // 要查询数据所属自定义Topic。从user类目开始，输入自定义Topic的后续所有类目。
    // dataType为HOT_STORAGE时需要有值
    /**
     * @var string
     */
    public $userTopic;

    // 下一页标识。如果存在下一页，服务会返回此Token，下次请求带上即可。
    /**
     * @var string
     */
    public $nextPageToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'signature'         => 'signature',
        'dataType'          => 'data_type',
        'asc'               => 'asc',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'identifier'        => 'identifier',
        'pageSize'          => 'page_size',
        'userTopic'         => 'user_topic',
        'nextPageToken'     => 'next_page_token',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('asc', $this->asc, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('identifier', $this->identifier, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->asc) {
            $res['asc'] = $this->asc;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->identifier) {
            $res['identifier'] = $this->identifier;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->userTopic) {
            $res['user_topic'] = $this->userTopic;
        }
        if (null !== $this->nextPageToken) {
            $res['next_page_token'] = $this->nextPageToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceModeldataRequest
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
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['asc'])) {
            $model->asc = $map['asc'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['identifier'])) {
            $model->identifier = $map['identifier'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['user_topic'])) {
            $model->userTopic = $map['user_topic'];
        }
        if (isset($map['next_page_token'])) {
            $model->nextPageToken = $map['next_page_token'];
        }

        return $model;
    }
}
