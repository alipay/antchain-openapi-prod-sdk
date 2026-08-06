<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotaryCheckMeta extends Model {
    protected $_name = [
        'agencyCode' => 'agency_code',
        'hashAlgorithm' => 'hash_algorithm',
        'notaryContent' => 'notary_content',
        'txHash' => 'tx_hash',
        'applicationCode' => 'application_code',
    ];
    public function validate() {
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->agencyCode) {
            $res['agency_code'] = $this->agencyCode;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->applicationCode) {
            $res['application_code'] = $this->applicationCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotaryCheckMeta
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['agency_code'])){
            $model->agencyCode = $map['agency_code'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['notary_content'])){
            $model->notaryContent = $map['notary_content'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['application_code'])){
            $model->applicationCode = $map['application_code'];
        }
        return $model;
    }
    // 对应的法院编号
    /**
     * @example hzfy
     * @var string
     */
    public $agencyCode;

    // 哈希算法, notary_type 为 HASH 时此参数必填
    /**
     * @example SHA256
     * @var string
     */
    public $hashAlgorithm;

    // 存证内容
    /**
     * @example 5p2t5bee5LuK5aSp5aSp5rCU6Zi0
     * @var string
     */
    public $notaryContent;

    // 交易哈希
    /**
     * @example aac0cf38b6072352f6b3be4cc0a3cf3950058472eacdda91e6723d75e2994567
     * @var string
     */
    public $txHash;

    // 应用ID
    /**
     * @example dstj
     * @var string
     */
    public $applicationCode;

}
