<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_3d5ac8b5948b43e7a7b8f62c44a6880f\Models;

use AlibabaCloud\Tea\Model;

class Archive extends Model
{
    // 附件内容的Hash值
    /**
     * @example 668fa851746fdf358c5f96efe87d07178b49b17c143e06a659c368e83de2027e
     *
     * @var string
     */
    public $archiveHash;

    // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
    /**
     * @example AT_SUOYOUQUANZHENG
     *
     * @var string
     */
    public $archiveType;

    // 移动后到银行目录下的oss存储路径
    /**
     * @example bk-ningbo/rcp/1434343413132/a.pdf
     *
     * @var string
     */
    public $bankOssKey;

    // 附件KEY，也是oss的存储路径，原始保存路径
    /**
     * @example bk-ningbo/2334545423232/abc.jpg
     *
     * @var string
     */
    public $ossKey;

    // 附件来源外部业务单号
    /**
     * @example 20200810001220080000000000000001
     *
     * @var string
     */
    public $outBizNo;

    // 机构编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $ownerNo;

    // 附件材料归属机构类型，比如：BANK=银行
    /**
     * @example BANK
     *
     * @var string
     */
    public $ownerType;

    // 移动到不动产中心目录下的oss存储路径
    /**
     * @example rtc-zhuhai/rcp/1434343413132/a.pdf
     *
     * @var string
     */
    public $rtcOssKey;

    // 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
    /**
     * @example ASS_BK_APPLY
     *
     * @var string
     */
    public $scene;

    // 房产链平台的存储路径
    /**
     * @example rcp/3323232/a.pdf
     *
     * @var string
     */
    public $rcpOssKey;

    // 助贷平台的访问路径
    /**
     * @example jiebei/23434343/a.pdf
     *
     * @var string
     */
    public $loanAssistPlatformOssKey;
    protected $_name = [
        'archiveHash'              => 'archive_hash',
        'archiveType'              => 'archive_type',
        'bankOssKey'               => 'bank_oss_key',
        'ossKey'                   => 'oss_key',
        'outBizNo'                 => 'out_biz_no',
        'ownerNo'                  => 'owner_no',
        'ownerType'                => 'owner_type',
        'rtcOssKey'                => 'rtc_oss_key',
        'scene'                    => 'scene',
        'rcpOssKey'                => 'rcp_oss_key',
        'loanAssistPlatformOssKey' => 'loan_assist_platform_oss_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->archiveHash) {
            $res['archive_hash'] = $this->archiveHash;
        }
        if (null !== $this->archiveType) {
            $res['archive_type'] = $this->archiveType;
        }
        if (null !== $this->bankOssKey) {
            $res['bank_oss_key'] = $this->bankOssKey;
        }
        if (null !== $this->ossKey) {
            $res['oss_key'] = $this->ossKey;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->ownerNo) {
            $res['owner_no'] = $this->ownerNo;
        }
        if (null !== $this->ownerType) {
            $res['owner_type'] = $this->ownerType;
        }
        if (null !== $this->rtcOssKey) {
            $res['rtc_oss_key'] = $this->rtcOssKey;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->rcpOssKey) {
            $res['rcp_oss_key'] = $this->rcpOssKey;
        }
        if (null !== $this->loanAssistPlatformOssKey) {
            $res['loan_assist_platform_oss_key'] = $this->loanAssistPlatformOssKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Archive
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['archive_hash'])) {
            $model->archiveHash = $map['archive_hash'];
        }
        if (isset($map['archive_type'])) {
            $model->archiveType = $map['archive_type'];
        }
        if (isset($map['bank_oss_key'])) {
            $model->bankOssKey = $map['bank_oss_key'];
        }
        if (isset($map['oss_key'])) {
            $model->ossKey = $map['oss_key'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['owner_no'])) {
            $model->ownerNo = $map['owner_no'];
        }
        if (isset($map['owner_type'])) {
            $model->ownerType = $map['owner_type'];
        }
        if (isset($map['rtc_oss_key'])) {
            $model->rtcOssKey = $map['rtc_oss_key'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['rcp_oss_key'])) {
            $model->rcpOssKey = $map['rcp_oss_key'];
        }
        if (isset($map['loan_assist_platform_oss_key'])) {
            $model->loanAssistPlatformOssKey = $map['loan_assist_platform_oss_key'];
        }

        return $model;
    }
}
