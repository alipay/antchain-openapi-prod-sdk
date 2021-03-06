<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpDetailRequest extends Model
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

    // ip的链上id列表
    /**
     * @var string[]
     */
    public $ipIds;

    // 查找不到的ip是否报错，默认false，会报错
    /**
     * @var bool
     */
    public $skipNotFoundIp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipIds'             => 'ip_ids',
        'skipNotFoundIp'    => 'skip_not_found_ip',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipIds', $this->ipIds, true);
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
        if (null !== $this->skipNotFoundIp) {
            $res['skip_not_found_ip'] = $this->skipNotFoundIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpDetailRequest
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
        if (isset($map['skip_not_found_ip'])) {
            $model->skipNotFoundIp = $map['skip_not_found_ip'];
        }

        return $model;
    }
}
