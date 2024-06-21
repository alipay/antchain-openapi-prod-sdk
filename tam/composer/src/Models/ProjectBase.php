<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ProjectBase extends Model
{
    // 项目记录ID
    /**
     * @example 1000111
     *
     * @var string
     */
    public $id;

    // 项目可读编码
    /**
     * @example xxx
     *
     * @var string
     */
    public $projectCode;

    // 项目名称
    /**
     * @example 杭州大数据局项目
     *
     * @var string
     */
    public $title;

    // 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
    /**
     * @example 蚂蚁
     *
     * @var string
     */
    public $source;

    // 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $contractor;

    // 项目所在阶段
    /**
     * @example xxx
     *
     * @var string
     */
    public $stage;

    // 项目状态
    /**
     * @example xxx
     *
     * @var string
     */
    public $status;

    // 预计签约日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $expectConDate;

    // 预估签约金额
    /**
     * @example 100
     *
     * @var string
     */
    public $expectConAmt;

    // 是否需要交付。1需要，0不需要
    /**
     * @example 1
     *
     * @var string
     */
    public $needPm;

    // 是否需要提前”进场“。1需要，0不需要。
    /**
     * @example 1
     *
     * @var string
     */
    public $needAdEntry;

    // 合作伙伴Id
    /**
     * @example 111
     *
     * @var string
     */
    public $partnerId;

    // partnerName
    /**
     * @example 阿里云
     *
     * @var string
     */
    public $partnerName;

    // 阿里云Bpid
    /**
     * @example 1
     *
     * @var string
     */
    public $aliyunBpid;

    // 客户ID
    /**
     * @example 111
     *
     * @var string
     */
    public $customerId;

    // 客户名称
    /**
     * @example 阿里云
     *
     * @var string
     */
    public $customerName;

    // BD
    /**
     * @example 111
     *
     * @var string
     */
    public $bdWorkNo;

    // PM
    /**
     * @example
     *
     * @var string[]
     */
    public $pmWorkNos;

    /**
     * @example
     *
     * @var string[]
     */
    public $tamList;

    /**
     * @example
     *
     * @var string[]
     */
    public $bdList;

    /**
     * @example
     *
     * @var string[]
     */
    public $tmList;

    /**
     * @example
     *
     * @var string[]
     */
    public $pmList;
    protected $_name = [
        'id'            => 'id',
        'projectCode'   => 'project_code',
        'title'         => 'title',
        'source'        => 'source',
        'contractor'    => 'contractor',
        'stage'         => 'stage',
        'status'        => 'status',
        'expectConDate' => 'expect_con_date',
        'expectConAmt'  => 'expect_con_amt',
        'needPm'        => 'need_pm',
        'needAdEntry'   => 'need_ad_entry',
        'partnerId'     => 'partner_id',
        'partnerName'   => 'partner_name',
        'aliyunBpid'    => 'aliyun_bpid',
        'customerId'    => 'customer_id',
        'customerName'  => 'customer_name',
        'bdWorkNo'      => 'bd_work_no',
        'pmWorkNos'     => 'pm_work_nos',
        'tamList'       => 'tam_list',
        'bdList'        => 'bd_list',
        'tmList'        => 'tm_list',
        'pmList'        => 'pm_list',
    ];

    public function validate()
    {
        Model::validatePattern('expectConDate', $this->expectConDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->contractor) {
            $res['contractor'] = $this->contractor;
        }
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->expectConDate) {
            $res['expect_con_date'] = $this->expectConDate;
        }
        if (null !== $this->expectConAmt) {
            $res['expect_con_amt'] = $this->expectConAmt;
        }
        if (null !== $this->needPm) {
            $res['need_pm'] = $this->needPm;
        }
        if (null !== $this->needAdEntry) {
            $res['need_ad_entry'] = $this->needAdEntry;
        }
        if (null !== $this->partnerId) {
            $res['partner_id'] = $this->partnerId;
        }
        if (null !== $this->partnerName) {
            $res['partner_name'] = $this->partnerName;
        }
        if (null !== $this->aliyunBpid) {
            $res['aliyun_bpid'] = $this->aliyunBpid;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->bdWorkNo) {
            $res['bd_work_no'] = $this->bdWorkNo;
        }
        if (null !== $this->pmWorkNos) {
            $res['pm_work_nos'] = $this->pmWorkNos;
        }
        if (null !== $this->tamList) {
            $res['tam_list'] = $this->tamList;
        }
        if (null !== $this->bdList) {
            $res['bd_list'] = $this->bdList;
        }
        if (null !== $this->tmList) {
            $res['tm_list'] = $this->tmList;
        }
        if (null !== $this->pmList) {
            $res['pm_list'] = $this->pmList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectBase
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['contractor'])) {
            $model->contractor = $map['contractor'];
        }
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['expect_con_date'])) {
            $model->expectConDate = $map['expect_con_date'];
        }
        if (isset($map['expect_con_amt'])) {
            $model->expectConAmt = $map['expect_con_amt'];
        }
        if (isset($map['need_pm'])) {
            $model->needPm = $map['need_pm'];
        }
        if (isset($map['need_ad_entry'])) {
            $model->needAdEntry = $map['need_ad_entry'];
        }
        if (isset($map['partner_id'])) {
            $model->partnerId = $map['partner_id'];
        }
        if (isset($map['partner_name'])) {
            $model->partnerName = $map['partner_name'];
        }
        if (isset($map['aliyun_bpid'])) {
            $model->aliyunBpid = $map['aliyun_bpid'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['bd_work_no'])) {
            $model->bdWorkNo = $map['bd_work_no'];
        }
        if (isset($map['pm_work_nos'])) {
            if (!empty($map['pm_work_nos'])) {
                $model->pmWorkNos = $map['pm_work_nos'];
            }
        }
        if (isset($map['tam_list'])) {
            if (!empty($map['tam_list'])) {
                $model->tamList = $map['tam_list'];
            }
        }
        if (isset($map['bd_list'])) {
            if (!empty($map['bd_list'])) {
                $model->bdList = $map['bd_list'];
            }
        }
        if (isset($map['tm_list'])) {
            if (!empty($map['tm_list'])) {
                $model->tmList = $map['tm_list'];
            }
        }
        if (isset($map['pm_list'])) {
            if (!empty($map['pm_list'])) {
                $model->pmList = $map['pm_list'];
            }
        }

        return $model;
    }
}
