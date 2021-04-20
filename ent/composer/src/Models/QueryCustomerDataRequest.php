<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerDataRequest extends Model
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

    // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
    /**
     * @var string
     */
    public $assetType;

    // 合约ID
    /**
     * @var string
     */
    public $contractId;

    // 数据类型，ASSET：资产信息， REVENUE：收益信息
    /**
     * @var string
     */
    public $dataType;

    // 截止时间，时区GMT+8，精确到毫秒
    /**
     * @var string
     */
    public $endTime;

    // 登录支付宝的账号，手机号或者邮箱
    /**
     * @var string
     */
    public $logonId;

    // 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
    /**
     * @var string
     */
    public $logonIdType;

    // 排序方式，ASC：升序， DESC：降序，默认按照时间降序
    /**
     * @var string
     */
    public $orderBy;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 起始时间，时区GMT+8，精确到毫秒
    /**
     * @var string
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetType'         => 'asset_type',
        'contractId'        => 'contract_id',
        'dataType'          => 'data_type',
        'endTime'           => 'end_time',
        'logonId'           => 'logon_id',
        'logonIdType'       => 'logon_id_type',
        'orderBy'           => 'order_by',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('logonId', $this->logonId, true);
        Model::validateRequired('logonIdType', $this->logonIdType, true);
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->logonId) {
            $res['logon_id'] = $this->logonId;
        }
        if (null !== $this->logonIdType) {
            $res['logon_id_type'] = $this->logonIdType;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomerDataRequest
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
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['logon_id'])) {
            $model->logonId = $map['logon_id'];
        }
        if (isset($map['logon_id_type'])) {
            $model->logonIdType = $map['logon_id_type'];
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
