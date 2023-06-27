<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDomestictrademarkExtensioninfoRequest extends Model
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

    // 数据集ID
    /**
     * @var string
     */
    public $dataSetId;

    // 商标唯一标识号
    /**
     * @var string
     */
    public $tid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSetId'         => 'data_set_id',
        'tid'               => 'tid',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('tid', $this->tid, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->tid) {
            $res['tid'] = $this->tid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDomestictrademarkExtensioninfoRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['tid'])) {
            $model->tid = $map['tid'];
        }

        return $model;
    }
}
