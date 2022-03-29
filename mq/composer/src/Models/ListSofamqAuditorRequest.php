<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSofamqAuditorRequest extends Model
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

    // 起始时间
    /**
     * @var int
     */
    public $closedStart;

    // 结束时间戳
    /**
     * @var int
     */
    public $openEnd;

    // 模糊资源名
    /**
     * @var string
     */
    public $resource;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'closedStart'       => 'closed_start',
        'openEnd'           => 'open_end',
        'resource'          => 'resource',
    ];

    public function validate()
    {
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
        if (null !== $this->closedStart) {
            $res['closed_start'] = $this->closedStart;
        }
        if (null !== $this->openEnd) {
            $res['open_end'] = $this->openEnd;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSofamqAuditorRequest
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
        if (isset($map['closed_start'])) {
            $model->closedStart = $map['closed_start'];
        }
        if (isset($map['open_end'])) {
            $model->openEnd = $map['open_end'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }

        return $model;
    }
}
