<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpGoodsdetailwithchannelRequest extends Model
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

    // 基础结构
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // ip的链上id
    /**
     * @var string[]
     */
    public $ipIds;

    // 查询的渠道名字
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipIds'             => 'ip_ids',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipIds', $this->ipIds, true);
        Model::validateRequired('channelName', $this->channelName, true);
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
        if (null !== $this->ipIds) {
            $res['ip_ids'] = $this->ipIds;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpGoodsdetailwithchannelRequest
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
        if (isset($map['ip_ids'])) {
            if (!empty($map['ip_ids'])) {
                $model->ipIds = $map['ip_ids'];
            }
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
