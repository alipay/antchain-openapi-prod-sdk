<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryInitInfo extends Model
{
    // 本阶段存证内容哈希值
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // 签署文件份数
    /**
     * @example 3
     *
     * @var int
     */
    public $fileNum;

    // 签署流程发起人ID
    /**
     * @example account_id_of_initiator
     *
     * @var string
     */
    public $initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
    /**
     * @example account_Id_1,account_id_2
     *
     * @var string
     */
    public $signatories;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;

    // 存证凭据，仅在批量核验时需要填写
    /**
     * @example 95a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1c92
     *
     * @var string
     */
    public $txHash;

    // 发起人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $intiatorName;

    // 签署人名称,多个逗号隔开
    /**
     * @example 李四,王五
     *
     * @var string
     */
    public $signatorNames;

    // 详细文件哈希
    /**
     * @example 91a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1cqa
     *
     * @var string
     */
    public $detailInfoFileHash;
    protected $_name = [
        'content'            => 'content',
        'fileNum'            => 'file_num',
        'initiator'          => 'initiator',
        'signatories'        => 'signatories',
        'timestamp'          => 'timestamp',
        'txHash'             => 'tx_hash',
        'intiatorName'       => 'intiator_name',
        'signatorNames'      => 'signator_names',
        'detailInfoFileHash' => 'detail_info_file_hash',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('fileNum', $this->fileNum, true);
        Model::validateRequired('initiator', $this->initiator, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
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
        if (null !== $this->intiatorName) {
            $res['intiator_name'] = $this->intiatorName;
        }
        if (null !== $this->signatorNames) {
            $res['signator_names'] = $this->signatorNames;
        }
        if (null !== $this->detailInfoFileHash) {
            $res['detail_info_file_hash'] = $this->detailInfoFileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryInitInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['file_num'])) {
            $model->fileNum = $map['file_num'];
        }
        if (isset($map['initiator'])) {
            $model->initiator = $map['initiator'];
        }
        if (isset($map['signatories'])) {
            $model->signatories = $map['signatories'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['intiator_name'])) {
            $model->intiatorName = $map['intiator_name'];
        }
        if (isset($map['signator_names'])) {
            $model->signatorNames = $map['signator_names'];
        }
        if (isset($map['detail_info_file_hash'])) {
            $model->detailInfoFileHash = $map['detail_info_file_hash'];
        }

        return $model;
    }
}
