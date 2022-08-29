<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowEvidenceResponse extends Model
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

    // 链上证据包对应的链上交易Hash，只有resultMsg为success时才返回
    /**
     * @var string
     */
    public $chainPackTxHash;

    // 暂不支持，预留字段，链下证据包对应的可下载链接，有效期3小时，只有申请时选择了链下证据包、查询入参evidencePackType选择LocalEvidencePack及resultMsg为success时才返回
    /**
     * @var string
     */
    public $localPackUrl;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'chainPackTxHash' => 'chain_pack_tx_hash',
        'localPackUrl'    => 'local_pack_url',
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
        if (null !== $this->chainPackTxHash) {
            $res['chain_pack_tx_hash'] = $this->chainPackTxHash;
        }
        if (null !== $this->localPackUrl) {
            $res['local_pack_url'] = $this->localPackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowEvidenceResponse
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
        if (isset($map['chain_pack_tx_hash'])) {
            $model->chainPackTxHash = $map['chain_pack_tx_hash'];
        }
        if (isset($map['local_pack_url'])) {
            $model->localPackUrl = $map['local_pack_url'];
        }

        return $model;
    }
}
