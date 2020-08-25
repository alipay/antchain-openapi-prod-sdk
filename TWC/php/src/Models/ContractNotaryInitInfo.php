<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryInitInfo extends Model {
    protected $_name = [
        'content' => 'content',
        'fileNum' => 'file_num',
        'initiator' => 'initiator',
        'signatories' => 'signatories',
        'timestamp' => 'timestamp',
        'txHash' => 'tx_hash',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->fileNum) {
            $res['file_num'] = $this->fileNum;
        }
        if (null !== $this->initiator) {
            $res['initiator'] = $this->initiator;
        }
        if (null !== $this->signatories) {
            $res['signatories'] = $this->signatories;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractNotaryInitInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['file_num'])){
            $model->fileNum = $map['file_num'];
        }
        if(isset($map['initiator'])){
            $model->initiator = $map['initiator'];
        }
        if(isset($map['signatories'])){
            $model->signatories = $map['signatories'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        return $model;
    }
    // 本阶段存证内容哈希值
    /**
     * @example content
     * @var string
     */
    public $content;

    // 签署文件份数
    /**
     * @example 3
     * @var int
     */
    public $fileNum;

    // 签署流程发起人ID
    /**
     * @example account_id_of_initiator
     * @var string
     */
    public $initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
    /**
     * @example account_Id_1,account_id_2
     * @var string
     */
    public $signatories;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
    /**
     * @example 1589198173000
     * @var string
     */
    public $timestamp;

    // 存证凭据，仅在批量核验时需要填写
    /**
     * @example 95a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1c92
     * @var string
     */
    public $txHash;

}
