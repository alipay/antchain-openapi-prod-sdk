<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidPersonFacevrfResponse extends Model
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

    // 认证是否通过。
    /**
     * @var string
     */
    public $passed;

    // 认证材料哈希是否匹配。 如果有传入材料哈希参数，匹配则返回值为 T；不匹配则返回值为 F。如果无材料哈希参数传入，则返回空。
    /**
     * @var string
     */
    public $materialMatched;

    // 身份信息，目前只有在ocr的场景下才有返回。
    // certName/certNo：本次认证通过的姓名和身份证；ocrInfo：本次OCR识别的结果，包含如下信息："address": 地址"nationality": 名族"num":身份证号码"sex":性别"name": 名称"birth": 生日"issue": 签发机关"endDate":到期日"startDate":发证日期；注意:认证通过的信息和OCR识别的信息可能不一致
    /**
     * @var string
     */
    public $identityInfo;

    // 长度不超过128字符的分布式数字身份DID
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'passed'          => 'passed',
        'materialMatched' => 'material_matched',
        'identityInfo'    => 'identity_info',
        'did'             => 'did',
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
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->materialMatched) {
            $res['material_matched'] = $this->materialMatched;
        }
        if (null !== $this->identityInfo) {
            $res['identity_info'] = $this->identityInfo;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidPersonFacevrfResponse
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
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['material_matched'])) {
            $model->materialMatched = $map['material_matched'];
        }
        if (isset($map['identity_info'])) {
            $model->identityInfo = $map['identity_info'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
