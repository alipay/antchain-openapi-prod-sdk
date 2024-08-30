<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VerifyAuthBusinessUserResponse extends Model
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

    // 用户当前记录状态
    /**
     * @var string
     */
    public $recordType;

    // 加密后的用户授权记录id
    /**
     * @var string
     */
    public $encryptBizId;

    // 授权协议信息列表
    /**
     * @var AgreementConfigInfoDTO[]
     */
    public $agreementConfigInfoList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'recordType'              => 'record_type',
        'encryptBizId'            => 'encrypt_biz_id',
        'agreementConfigInfoList' => 'agreement_config_info_list',
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
        if (null !== $this->recordType) {
            $res['record_type'] = $this->recordType;
        }
        if (null !== $this->encryptBizId) {
            $res['encrypt_biz_id'] = $this->encryptBizId;
        }
        if (null !== $this->agreementConfigInfoList) {
            $res['agreement_config_info_list'] = [];
            if (null !== $this->agreementConfigInfoList && \is_array($this->agreementConfigInfoList)) {
                $n = 0;
                foreach ($this->agreementConfigInfoList as $item) {
                    $res['agreement_config_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAuthBusinessUserResponse
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
        if (isset($map['record_type'])) {
            $model->recordType = $map['record_type'];
        }
        if (isset($map['encrypt_biz_id'])) {
            $model->encryptBizId = $map['encrypt_biz_id'];
        }
        if (isset($map['agreement_config_info_list'])) {
            if (!empty($map['agreement_config_info_list'])) {
                $model->agreementConfigInfoList = [];
                $n                              = 0;
                foreach ($map['agreement_config_info_list'] as $item) {
                    $model->agreementConfigInfoList[$n++] = null !== $item ? AgreementConfigInfoDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
