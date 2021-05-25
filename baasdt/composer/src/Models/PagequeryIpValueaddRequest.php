<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIpValueaddRequest extends Model
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

    // 基础字段
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 归属账户id
    /**
     * @var string
     */
    public $accountId;

    // 服务名字，模糊匹配
    /**
     * @var string
     */
    public $serviceName;

    // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
    /**
     * @var int
     */
    public $status;

    // 第几页
    /**
     * @var int
     */
    public $pageIndex;

    // 每页长度
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间
    /**
     * @var string
     */
    public $beginCreateTime;

    // 结束时间
    /**
     * @var string
     */
    public $engCreateTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'serviceName'       => 'service_name',
        'status'            => 'status',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'beginCreateTime'   => 'begin_create_time',
        'engCreateTime'     => 'eng_create_time',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('beginCreateTime', $this->beginCreateTime, true);
        Model::validateRequired('engCreateTime', $this->engCreateTime, true);
        Model::validatePattern('beginCreateTime', $this->beginCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('engCreateTime', $this->engCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->beginCreateTime) {
            $res['begin_create_time'] = $this->beginCreateTime;
        }
        if (null !== $this->engCreateTime) {
            $res['eng_create_time'] = $this->engCreateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIpValueaddRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['begin_create_time'])) {
            $model->beginCreateTime = $map['begin_create_time'];
        }
        if (isset($map['eng_create_time'])) {
            $model->engCreateTime = $map['eng_create_time'];
        }

        return $model;
    }
}
