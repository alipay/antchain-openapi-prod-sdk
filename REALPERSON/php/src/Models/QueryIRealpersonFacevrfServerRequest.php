<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryIRealpersonFacevrfServerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'certifyId' => 'certify_id',
        'externParam' => 'extern_param',
        'materialHash' => 'material_hash',
        'outerOrderNo' => 'outer_order_no',
        'sceneId' => 'scene_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->materialHash) {
            $res['material_hash'] = $this->materialHash;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryIRealpersonFacevrfServerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['certify_id'])){
            $model->certifyId = $map['certify_id'];
        }
        if(isset($map['extern_param'])){
            $model->externParam = $map['extern_param'];
        }
        if(isset($map['material_hash'])){
            $model->materialHash = $map['material_hash'];
        }
        if(isset($map['outer_order_no'])){
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if(isset($map['scene_id'])){
            $model->sceneId = $map['scene_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 实人认证唯一标识
    /**
     * @var string
     */
    public $certifyId;

    // 预留扩展业务参数
    /**
     * @var string
     */
    public $externParam;

    // 认证材料（如人脸图像）的哈希
    /**
     * @var string
     */
    public $materialHash;

    // 外部唯一标识。用于定位。
    // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outerOrderNo;

    // 场景ID
    /**
     * @var string
     */
    public $sceneId;

}
