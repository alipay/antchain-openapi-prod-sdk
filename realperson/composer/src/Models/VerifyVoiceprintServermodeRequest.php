<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class VerifyVoiceprintServermodeRequest extends Model
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

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outerOrderNo;

    // 商户自定义的用户ID
    /**
     * @var string
     */
    public $userId;

    // 音频文件，base64编码格式
    //
    /**
     * @var string
     */
    public $audioAuth;

    // 音频文件OSS地址
    /**
     * @var string
     */
    public $audioUrl;

    // 音频元数据
    /**
     * @var AudioMeta
     */
    public $audioMeta;

    // 预留扩展参数
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'userId'            => 'user_id',
        'audioAuth'         => 'audio_auth',
        'audioUrl'          => 'audio_url',
        'audioMeta'         => 'audio_meta',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('audioMeta', $this->audioMeta, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->audioAuth) {
            $res['audio_auth'] = $this->audioAuth;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }
        if (null !== $this->audioMeta) {
            $res['audio_meta'] = null !== $this->audioMeta ? $this->audioMeta->toMap() : null;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyVoiceprintServermodeRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['audio_auth'])) {
            $model->audioAuth = $map['audio_auth'];
        }
        if (isset($map['audio_url'])) {
            $model->audioUrl = $map['audio_url'];
        }
        if (isset($map['audio_meta'])) {
            $model->audioMeta = AudioMeta::fromMap($map['audio_meta']);
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
