<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class RecognizeFaceauthOcrRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 数据内容
    /**
     * @var string
     */
    public $dataContext;

    // 数据类型：OSS_ADDR/BASE64_JPG
    /**
     * @var string
     */
    public $dataType;

    // 扩展字段
    /**
     * @var string
     */
    public $externParam;

    // face: 身份证正面 back: 身份证反面 缺省值是：face
    //
    /**
     * @var string
     */
    public $side;

    // zimid
    /**
     * @var string
     */
    public $zimId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataContext'       => 'data_context',
        'dataType'          => 'data_type',
        'externParam'       => 'extern_param',
        'side'              => 'side',
        'zimId'             => 'zim_id',
    ];

    public function validate()
    {
        Model::validateRequired('dataContext', $this->dataContext, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('side', $this->side, true);
        Model::validateRequired('zimId', $this->zimId, true);
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
        if (null !== $this->dataContext) {
            $res['data_context'] = $this->dataContext;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->side) {
            $res['side'] = $this->side;
        }
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeFaceauthOcrRequest
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
        if (isset($map['data_context'])) {
            $model->dataContext = $map['data_context'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['side'])) {
            $model->side = $map['side'];
        }
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }

        return $model;
    }
}
