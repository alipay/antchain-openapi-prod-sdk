<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class CreateCodeRelationRequest extends Model
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

    // 业务类型，客户自定义标签，做code数据隔离使用
    /**
     * @var string
     */
    public $bizType;

    // 溯源码，代表该账户的唯一资源标识
    /**
     * @var string
     */
    public $code;

    // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
    /**
     * @var string
     */
    public $status;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    /**
     * @var string[]
     */
    public $bizLabels;

    // 是否上链，默认true。 为false时，仅做DB数据保存不上链。
    // 若content数据大小超过要求限制，仅会保存content的hash值上链
    /**
     * @var bool
     */
    public $upChainFlag;

    // 关联内容
    //
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'code'              => 'code',
        'status'            => 'status',
        'bizLabels'         => 'biz_labels',
        'upChainFlag'       => 'up_chain_flag',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMaxLength('code', $this->code, 160);
        Model::validateMaxLength('status', $this->status, 32);
        Model::validateMinLength('bizType', $this->bizType, 1);
        Model::validateMinLength('code', $this->code, 1);
        Model::validateMinLength('status', $this->status, 1);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bizLabels) {
            $res['biz_labels'] = $this->bizLabels;
        }
        if (null !== $this->upChainFlag) {
            $res['up_chain_flag'] = $this->upChainFlag;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCodeRelationRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['biz_labels'])) {
            if (!empty($map['biz_labels'])) {
                $model->bizLabels = $map['biz_labels'];
            }
        }
        if (isset($map['up_chain_flag'])) {
            $model->upChainFlag = $map['up_chain_flag'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
