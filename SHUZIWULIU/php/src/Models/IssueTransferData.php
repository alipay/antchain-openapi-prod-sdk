<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class IssueTransferData extends Model {
    protected $_name = [
        'issueId' => 'issue_id',
        'payerDid' => 'payer_did',
        'rcvDid' => 'rcv_did',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->payerDid) {
            $res['payer_did'] = $this->payerDid;
        }
        if (null !== $this->rcvDid) {
            $res['rcv_did'] = $this->rcvDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IssueTransferData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['issue_id'])){
            $model->issueId = $map['issue_id'];
        }
        if(isset($map['payer_did'])){
            $model->payerDid = $map['payer_did'];
        }
        if(isset($map['rcv_did'])){
            $model->rcvDid = $map['rcv_did'];
        }
        return $model;
    }
    // 凭证id
    /**
     * @example 11111111
     * @var string
     */
    public $issueId;

    // 转出方did
    /**
     * @example 11111
     * @var string
     */
    public $payerDid;

    // 接收方did
    /**
     * @example 111111
     * @var string
     */
    public $rcvDid;

}
