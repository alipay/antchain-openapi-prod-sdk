<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConnectortriggerconfigsRequest extends Model
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

    // source类型
    /**
     * @var string
     */
    public $sourceType;

    // sink类型
    /**
     * @var string
     */
    public $sinkType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceType'        => 'source_type',
        'sinkType'          => 'sink_type',
    ];

    public function validate()
    {
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('sinkType', $this->sinkType, true);
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
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->sinkType) {
            $res['sink_type'] = $this->sinkType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConnectortriggerconfigsRequest
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
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['sink_type'])) {
            $model->sinkType = $map['sink_type'];
        }

        return $model;
    }
}
