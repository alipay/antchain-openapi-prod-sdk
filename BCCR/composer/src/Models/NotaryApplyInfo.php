<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryApplyInfo extends Model
{
    // 公证处ID
    /**
     * @example 公证处ID
     *
     * @var string
     */
    public $orgId;

    // 取证人和取证信息列表
    /**
     * @example
     *
     * @var EvidInfo[]
     */
    public $evidInfos;

    // 申办事由
    /**
     * @example
     *
     * @var BidReason
     */
    public $bidReason;

    // 申请人信息
    /**
     * @example
     *
     * @var NotaryUser[]
     */
    public $applicantInfos;

    // 经办人信息
    /**
     * @example
     *
     * @var NotaryUser
     */
    public $operatorInfo;

    // 授权书
    /**
     * @example
     *
     * @var string[]
     */
    public $warrantFileList;

    // 权利证明材料
    /**
     * @example
     *
     * @var string[]
     */
    public $testifyFileList;

    // 保全内容
    /**
     * @example xxx
     *
     * @var string
     */
    public $preservationContent;

    // 用户申办备注
    /**
     * @example 用户申办备注
     *
     * @var string
     */
    public $comments;
    protected $_name = [
        'orgId'               => 'org_id',
        'evidInfos'           => 'evid_infos',
        'bidReason'           => 'bid_reason',
        'applicantInfos'      => 'applicant_infos',
        'operatorInfo'        => 'operator_info',
        'warrantFileList'     => 'warrant_file_list',
        'testifyFileList'     => 'testify_file_list',
        'preservationContent' => 'preservation_content',
        'comments'            => 'comments',
    ];

    public function validate()
    {
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('evidInfos', $this->evidInfos, true);
        Model::validateRequired('bidReason', $this->bidReason, true);
        Model::validateRequired('applicantInfos', $this->applicantInfos, true);
        Model::validateRequired('operatorInfo', $this->operatorInfo, true);
        Model::validateRequired('warrantFileList', $this->warrantFileList, true);
        Model::validateRequired('testifyFileList', $this->testifyFileList, true);
        Model::validateRequired('preservationContent', $this->preservationContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->evidInfos) {
            $res['evid_infos'] = [];
            if (null !== $this->evidInfos && \is_array($this->evidInfos)) {
                $n = 0;
                foreach ($this->evidInfos as $item) {
                    $res['evid_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bidReason) {
            $res['bid_reason'] = null !== $this->bidReason ? $this->bidReason->toMap() : null;
        }
        if (null !== $this->applicantInfos) {
            $res['applicant_infos'] = [];
            if (null !== $this->applicantInfos && \is_array($this->applicantInfos)) {
                $n = 0;
                foreach ($this->applicantInfos as $item) {
                    $res['applicant_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->operatorInfo) {
            $res['operator_info'] = null !== $this->operatorInfo ? $this->operatorInfo->toMap() : null;
        }
        if (null !== $this->warrantFileList) {
            $res['warrant_file_list'] = $this->warrantFileList;
        }
        if (null !== $this->testifyFileList) {
            $res['testify_file_list'] = $this->testifyFileList;
        }
        if (null !== $this->preservationContent) {
            $res['preservation_content'] = $this->preservationContent;
        }
        if (null !== $this->comments) {
            $res['comments'] = $this->comments;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['evid_infos'])) {
            if (!empty($map['evid_infos'])) {
                $model->evidInfos = [];
                $n                = 0;
                foreach ($map['evid_infos'] as $item) {
                    $model->evidInfos[$n++] = null !== $item ? EvidInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['bid_reason'])) {
            $model->bidReason = BidReason::fromMap($map['bid_reason']);
        }
        if (isset($map['applicant_infos'])) {
            if (!empty($map['applicant_infos'])) {
                $model->applicantInfos = [];
                $n                     = 0;
                foreach ($map['applicant_infos'] as $item) {
                    $model->applicantInfos[$n++] = null !== $item ? NotaryUser::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['operator_info'])) {
            $model->operatorInfo = NotaryUser::fromMap($map['operator_info']);
        }
        if (isset($map['warrant_file_list'])) {
            if (!empty($map['warrant_file_list'])) {
                $model->warrantFileList = $map['warrant_file_list'];
            }
        }
        if (isset($map['testify_file_list'])) {
            if (!empty($map['testify_file_list'])) {
                $model->testifyFileList = $map['testify_file_list'];
            }
        }
        if (isset($map['preservation_content'])) {
            $model->preservationContent = $map['preservation_content'];
        }
        if (isset($map['comments'])) {
            $model->comments = $map['comments'];
        }

        return $model;
    }
}
