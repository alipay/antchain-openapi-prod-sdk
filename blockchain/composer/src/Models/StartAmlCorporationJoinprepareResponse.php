<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAmlCorporationJoinprepareResponse extends Model
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

    // 企业在反洗钱联盟中的唯一区块链标示，后续和平台的交互都要通过该标示
    /**
     * @var string
     */
    public $did;

    // mytf的认证信息，加盟方可以验证其有效性
    /**
     * @var string
     */
    public $mytfInfo;

    // 平台提供的各类tapp信息，入驻方需要从中选择自己使用的tapp，并记录下tapp的加密私钥和签名密钥；后续平台发给加盟放的所有信息都会携带签名；而所有发往TAPP的数据都需要使用对应加密公钥进行加密来保证数据安全
    /**
     * @var string[]
     */
    public $tappInfos;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'did'        => 'did',
        'mytfInfo'   => 'mytf_info',
        'tappInfos'  => 'tapp_infos',
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->mytfInfo) {
            $res['mytf_info'] = $this->mytfInfo;
        }
        if (null !== $this->tappInfos) {
            $res['tapp_infos'] = $this->tappInfos;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAmlCorporationJoinprepareResponse
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['mytf_info'])) {
            $model->mytfInfo = $map['mytf_info'];
        }
        if (isset($map['tapp_infos'])) {
            if (!empty($map['tapp_infos'])) {
                $model->tappInfos = $map['tapp_infos'];
            }
        }

        return $model;
    }
}
