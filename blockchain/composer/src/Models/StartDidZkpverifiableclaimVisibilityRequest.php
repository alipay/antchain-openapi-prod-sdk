<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidZkpverifiableclaimVisibilityRequest extends Model
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

    // vc颁发者
    /**
     * @var string
     */
    public $issuer;

    // 哪些字段将被展示。
    // 如果父路径和子路径都被包含，那么将以最上级路径为准，展示上级路径对应的内容
    /**
     * @var string[]
     */
    public $path;

    // vc完整原文
    /**
     * @var string
     */
    public $vc;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'issuer'            => 'issuer',
        'path'              => 'path',
        'vc'                => 'vc',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('vc', $this->vc, true);
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
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidZkpverifiableclaimVisibilityRequest
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
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['path'])) {
            if (!empty($map['path'])) {
                $model->path = $map['path'];
            }
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
