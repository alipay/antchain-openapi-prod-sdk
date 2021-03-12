<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcBatchauthResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 输入参数的bizId返回
    /**
     * @var string
     */
    public $bizId;

    // 具体业务的类型说明，来自入参。
    /**
     * @var string
     */
    public $bizType;

    // 本次可验证声明颁发者的DID
    /**
     * @var string
     */
    public $issuerDid;

    // 颁发的多个可验证声明结果列表。
    /**
     * @var VcContent[]
     */
    public $vcList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizId'      => 'biz_id',
        'bizType'    => 'biz_type',
        'issuerDid'  => 'issuer_did',
        'vcList'     => 'vc_list',
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->vcList) {
            $res['vc_list'] = [];
            if (null !== $this->vcList && \is_array($this->vcList)) {
                $n = 0;
                foreach ($this->vcList as $item) {
                    $res['vc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcBatchauthResponse
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['vc_list'])) {
            if (!empty($map['vc_list'])) {
                $model->vcList = [];
                $n             = 0;
                foreach ($map['vc_list'] as $item) {
                    $model->vcList[$n++] = null !== $item ? VcContent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
