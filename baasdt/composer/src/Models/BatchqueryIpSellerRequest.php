<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpSellerRequest extends Model
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

    // 基础信息
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 不同的平台标识
    /**
     * @var string
     */
    public $channelName;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 分页索引
    /**
     * @var int
     */
    public $pageIndex;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'channelName'       => 'channel_name',
        'pageSize'          => 'page_size',
        'pageIndex'         => 'page_index',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
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
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpSellerRequest
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
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }

        return $model;
    }
}
