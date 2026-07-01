<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignFieldDetail extends Model
{
    // 签约主体类别，0-个人，1-机构，默认0,2 是不限
    /**
     * @example 1
     *
     * @var int
     */
    public $actorIndentityType;

    // 添加时间
    /**
     * @example 1561473111450
     *
     * @var int
     */
    public $addTime;

    // 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $assignedPosbean;

    // 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $assignedSeal;

    // 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
    /**
     * @example 2c7de24aff3340f5b944ebac49545b8e
     *
     * @var string
     */
    public $authorizedAccountId;

    // 是否自动执行，TRUE需要静默授权，配置项，无默认值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoExecute;

    // 执行失败原因
    /**
     * @example
     *
     * @var string
     */
    public $executeFailedReason;

    // 文件file id
    /**
     * @example fe7df2f477d649c18ebcfdfffeba253d
     *
     * @var string
     */
    public $fileId;

    // 流程id
    /**
     * @example b2cb74258a634179b0df3cc54791c8b6
     *
     * @var string
     */
    public $flowId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * @example 1
     *
     * @var int
     */
    public $order;

    // 页码信息，可以_,_或_-_分割
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标
    /**
     * @example 158.72531
     *
     * @var string
     */
    public $posX;

    // y坐标
    /**
     * @example 431.05658
     *
     * @var string
     */
    public $posY;

    // 印章文件file key
    /**
     * @example
     *
     * @var string
     */
    public $sealFileKey;

    // 印章id
    /**
     * @example
     *
     * @var string
     */
    public $sealId;

    // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
    /**
     * @example
     *
     * @var string
     */
    public $sealType;

    // 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
    /**
     * @example faea8237c61a4fdea864ee8d7621e14f
     *
     * @var string
     */
    public $signerAccountId;

    // 签署区Id
    /**
     * @example b76b69d5b48d4f689cae997e42809ac4
     *
     * @var string
     */
    public $signfieldId;

    // 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
    /**
     * @example 0
     *
     * @var int
     */
    public $signType;

    // 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成"）
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 状态描述
    /**
     * @example 执行中
     *
     * @var string
     */
    public $statusDescription;

    // 签署区宽
    /**
     * @example
     *
     * @var string
     */
    public $width;
    protected $_name = [
        'actorIndentityType'  => 'actor_indentity_type',
        'addTime'             => 'add_time',
        'assignedPosbean'     => 'assigned_posbean',
        'assignedSeal'        => 'assigned_seal',
        'authorizedAccountId' => 'authorized_account_id',
        'autoExecute'         => 'auto_execute',
        'executeFailedReason' => 'execute_failed_reason',
        'fileId'              => 'file_id',
        'flowId'              => 'flow_id',
        'order'               => 'order',
        'posPage'             => 'pos_page',
        'posX'                => 'pos_x',
        'posY'                => 'pos_y',
        'sealFileKey'         => 'seal_file_key',
        'sealId'              => 'seal_id',
        'sealType'            => 'seal_type',
        'signerAccountId'     => 'signer_account_id',
        'signfieldId'         => 'signfield_id',
        'signType'            => 'sign_type',
        'status'              => 'status',
        'statusDescription'   => 'status_description',
        'width'               => 'width',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actorIndentityType) {
            $res['actor_indentity_type'] = $this->actorIndentityType;
        }
        if (null !== $this->addTime) {
            $res['add_time'] = $this->addTime;
        }
        if (null !== $this->assignedPosbean) {
            $res['assigned_posbean'] = $this->assignedPosbean;
        }
        if (null !== $this->assignedSeal) {
            $res['assigned_seal'] = $this->assignedSeal;
        }
        if (null !== $this->authorizedAccountId) {
            $res['authorized_account_id'] = $this->authorizedAccountId;
        }
        if (null !== $this->autoExecute) {
            $res['auto_execute'] = $this->autoExecute;
        }
        if (null !== $this->executeFailedReason) {
            $res['execute_failed_reason'] = $this->executeFailedReason;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->posPage) {
            $res['pos_page'] = $this->posPage;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        if (null !== $this->sealFileKey) {
            $res['seal_file_key'] = $this->sealFileKey;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
        }
        if (null !== $this->signerAccountId) {
            $res['signer_account_id'] = $this->signerAccountId;
        }
        if (null !== $this->signfieldId) {
            $res['signfield_id'] = $this->signfieldId;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusDescription) {
            $res['status_description'] = $this->statusDescription;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignFieldDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['actor_indentity_type'])) {
            $model->actorIndentityType = $map['actor_indentity_type'];
        }
        if (isset($map['add_time'])) {
            $model->addTime = $map['add_time'];
        }
        if (isset($map['assigned_posbean'])) {
            $model->assignedPosbean = $map['assigned_posbean'];
        }
        if (isset($map['assigned_seal'])) {
            $model->assignedSeal = $map['assigned_seal'];
        }
        if (isset($map['authorized_account_id'])) {
            $model->authorizedAccountId = $map['authorized_account_id'];
        }
        if (isset($map['auto_execute'])) {
            $model->autoExecute = $map['auto_execute'];
        }
        if (isset($map['execute_failed_reason'])) {
            $model->executeFailedReason = $map['execute_failed_reason'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['pos_page'])) {
            $model->posPage = $map['pos_page'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }
        if (isset($map['seal_file_key'])) {
            $model->sealFileKey = $map['seal_file_key'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['seal_type'])) {
            $model->sealType = $map['seal_type'];
        }
        if (isset($map['signer_account_id'])) {
            $model->signerAccountId = $map['signer_account_id'];
        }
        if (isset($map['signfield_id'])) {
            $model->signfieldId = $map['signfield_id'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['status_description'])) {
            $model->statusDescription = $map['status_description'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }

        return $model;
    }
}
