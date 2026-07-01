<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OperateLeasePetcomparepetsResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 用于追踪业务调用流程
    /**
     * @var string
     */
    public $traceId;

    // 取值范围0~1，值越大代表本次校验结果越可信
    /**
     * @var string
     */
    public $confidence;

    // 比对结果：1通过，0不通过
    /**
     * @var string
     */
    public $isSamePet;

    // 鼻纹相似度
    /**
     * @var string
     */
    public $noseSimilarity;

    // 正脸相似度
    /**
     * @var string
     */
    public $faceSimilarity;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'traceId'        => 'trace_id',
        'confidence'     => 'confidence',
        'isSamePet'      => 'is_same_pet',
        'noseSimilarity' => 'nose_similarity',
        'faceSimilarity' => 'face_similarity',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->confidence) {
            $res['confidence'] = $this->confidence;
        }
        if (null !== $this->isSamePet) {
            $res['is_same_pet'] = $this->isSamePet;
        }
        if (null !== $this->noseSimilarity) {
            $res['nose_similarity'] = $this->noseSimilarity;
        }
        if (null !== $this->faceSimilarity) {
            $res['face_similarity'] = $this->faceSimilarity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateLeasePetcomparepetsResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['confidence'])) {
            $model->confidence = $map['confidence'];
        }
        if (isset($map['is_same_pet'])) {
            $model->isSamePet = $map['is_same_pet'];
        }
        if (isset($map['nose_similarity'])) {
            $model->noseSimilarity = $map['nose_similarity'];
        }
        if (isset($map['face_similarity'])) {
            $model->faceSimilarity = $map['face_similarity'];
        }

        return $model;
    }
}
