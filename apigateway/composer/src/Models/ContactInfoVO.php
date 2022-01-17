<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ContactInfoVO extends Model
{
    // 授权App标识
    /**
     * @example a0VIPBXUI4rc25gR
     *
     * @var string
     */
    public $authAppInfoId;

    // 公司名称
    /**
     * @example antfinancial
     *
     * @var string
     */
    public $company;

    // 联系方式标识
    /**
     * @example a0VIPBcUI4rd25gR
     *
     * @var string
     */
    public $contactId;

    // 电子邮箱
    /**
     * @example kelly.cq@antfin.com
     *
     * @var string
     */
    public $mail;

    // 联系人姓名
    /**
     * @example kelly
     *
     * @var string
     */
    public $name;

    // 电话号码
    /**
     * @example 0571-81234567
     *
     * @var string
     */
    public $tel;

    // 租户标识
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'authAppInfoId' => 'auth_app_info_id',
        'company'       => 'company',
        'contactId'     => 'contact_id',
        'mail'          => 'mail',
        'name'          => 'name',
        'tel'           => 'tel',
        'tenantId'      => 'tenant_id',
        'workspaceId'   => 'workspace_id',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authAppInfoId) {
            $res['auth_app_info_id'] = $this->authAppInfoId;
        }
        if (null !== $this->company) {
            $res['company'] = $this->company;
        }
        if (null !== $this->contactId) {
            $res['contact_id'] = $this->contactId;
        }
        if (null !== $this->mail) {
            $res['mail'] = $this->mail;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tel) {
            $res['tel'] = $this->tel;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContactInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_app_info_id'])) {
            $model->authAppInfoId = $map['auth_app_info_id'];
        }
        if (isset($map['company'])) {
            $model->company = $map['company'];
        }
        if (isset($map['contact_id'])) {
            $model->contactId = $map['contact_id'];
        }
        if (isset($map['mail'])) {
            $model->mail = $map['mail'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tel'])) {
            $model->tel = $map['tel'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
