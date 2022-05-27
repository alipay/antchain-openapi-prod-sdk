<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class InitAntiImagesyncRequest extends Model
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

    // 防伪码类型标识,由蚂蚁侧分配
    /**
     * @var string
     */
    public $codeType;

    // 防伪码批次号
    /**
     * @var string
     */
    public $batchNo;

    // 批次下要上传的防伪码总数
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'codeType'          => 'code_type',
        'batchNo'           => 'batch_no',
        'total'             => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('codeType', $this->codeType, true);
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('total', $this->total, true);
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
        if (null !== $this->codeType) {
            $res['code_type'] = $this->codeType;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntiImagesyncRequest
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
        if (isset($map['code_type'])) {
            $model->codeType = $map['code_type'];
        }
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
