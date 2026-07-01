<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryFinishInfo extends Model
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

    // 发起人ID
    /**
     * @example account_id_of_initiator
     *
     * @var string
     */
    public $initiator;

    // 签署人ID（支持多个，不同ID间用“,”分隔开）
    /**
     * @example account_id_1,account_id_2
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

    // signatories对应的用户类型
    /**
     * @example PERSON,ENTERPRISE,PERSON
     *
     * @var string
     */
    public $userTypes;

    // 签署合同所属行业
    /**
     * @example finance
     *
     * @var string
     */
    public $businessType;

    // 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
    /**
     * @example 888,0,888
     *
     * @var string
     */
    public $amounts;

    // 签署方数量
    /**
     * @example 2
     *
     * @var int
     */
    public $signPartyCount;

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
     * @example a91a8201ad7362f9d224937cfb715b086ea1cf0d884f1c5b1f3ed092fddff1cqa
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
        'userTypes'          => 'user_types',
        'businessType'       => 'business_type',
        'amounts'            => 'amounts',
        'signPartyCount'     => 'sign_party_count',
        'intiatorName'       => 'intiator_name',
        'signatorNames'      => 'signator_names',
        'detailInfoFileHash' => 'detail_info_file_hash',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('fileNum', $this->fileNum, true);
        Model::validateRequired('initiator', $this->initiator, true);
        Model::validateRequired('signatories', $this->signatories, true);
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
        if (null !== $this->userTypes) {
            $res['user_types'] = $this->userTypes;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->amounts) {
            $res['amounts'] = $this->amounts;
        }
        if (null !== $this->signPartyCount) {
            $res['sign_party_count'] = $this->signPartyCount;
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
     * @return ContractNotaryFinishInfo
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
        if (isset($map['user_types'])) {
            $model->userTypes = $map['user_types'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }
        if (isset($map['amounts'])) {
            $model->amounts = $map['amounts'];
        }
        if (isset($map['sign_party_count'])) {
            $model->signPartyCount = $map['sign_party_count'];
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
