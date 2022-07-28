<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddRegisterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 文件oss id
    /**
     * @var string
     */
    public $fileId;

    // 是否自动创建公证书,默认否
    /**
     * @var bool
     */
    public $createCertificate;

    // 证书类型
    /**
     * @var string
     */
    public $certificateType;

    // 是否创建证据包，默认否
    /**
     * @var bool
     */
    public $createPackage;

    // 公证处id
    /**
     * @var string
     */
    public $orgId;

    // 文件名称
    /**
     * @var string
     */
    public $name;

    // 文件类型
    /**
     * @var string
     */
    public $type;

    // 备注
    /**
     * @var string
     */
    public $memo;

    // 证件名称
    /**
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 电话号码
    /**
     * @var string
     */
    public $phoneNum;

    // 作品信息
    /**
     * @var WorksInfo
     */
    public $worksInfo;

    // 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
    /**
     * @var bool
     */
    public $createStatement;

    // 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    /**
     * @var string
     */
    public $managerName;

    // 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
    /**
     * @var string
     */
    public $managerNo;

    // 权利信息
    /**
     * @var RightsInfo
     */
    public $rightsInfo;

    // 附属证据信息（最多5个文件，传递的是FileId）
    /**
     * @var string[]
     */
    public $ancillaryEvidence;

    // 著作权人信息
    /**
     * @var CopyrightCertInfo
     */
    public $copyrightOwnerInfo;

    // 幂等
    /**
     * @var string
     */
    public $clientToken;

    // 同步账号信息
    /**
     * @var AccountData
     */
    public $syncInfo;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'fileId'             => 'file_id',
        'createCertificate'  => 'create_certificate',
        'certificateType'    => 'certificate_type',
        'createPackage'      => 'create_package',
        'orgId'              => 'org_id',
        'name'               => 'name',
        'type'               => 'type',
        'memo'               => 'memo',
        'certName'           => 'cert_name',
        'certNo'             => 'cert_no',
        'certType'           => 'cert_type',
        'phoneNum'           => 'phone_num',
        'worksInfo'          => 'works_info',
        'createStatement'    => 'create_statement',
        'managerName'        => 'manager_name',
        'managerNo'          => 'manager_no',
        'rightsInfo'         => 'rights_info',
        'ancillaryEvidence'  => 'ancillary_evidence',
        'copyrightOwnerInfo' => 'copyright_owner_info',
        'clientToken'        => 'client_token',
        'syncInfo'           => 'sync_info',
        'proxyInfo'          => 'proxy_info',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateMaxLength('name', $this->name, 128);
        Model::validateMaxLength('memo', $this->memo, 512);
        Model::validateMaxLength('managerName', $this->managerName, 32);
        Model::validateMaxLength('managerNo', $this->managerNo, 30);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->createCertificate) {
            $res['create_certificate'] = $this->createCertificate;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->createPackage) {
            $res['create_package'] = $this->createPackage;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->worksInfo) {
            $res['works_info'] = null !== $this->worksInfo ? $this->worksInfo->toMap() : null;
        }
        if (null !== $this->createStatement) {
            $res['create_statement'] = $this->createStatement;
        }
        if (null !== $this->managerName) {
            $res['manager_name'] = $this->managerName;
        }
        if (null !== $this->managerNo) {
            $res['manager_no'] = $this->managerNo;
        }
        if (null !== $this->rightsInfo) {
            $res['rights_info'] = null !== $this->rightsInfo ? $this->rightsInfo->toMap() : null;
        }
        if (null !== $this->ancillaryEvidence) {
            $res['ancillary_evidence'] = $this->ancillaryEvidence;
        }
        if (null !== $this->copyrightOwnerInfo) {
            $res['copyright_owner_info'] = null !== $this->copyrightOwnerInfo ? $this->copyrightOwnerInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->syncInfo) {
            $res['sync_info'] = null !== $this->syncInfo ? $this->syncInfo->toMap() : null;
        }
        if (null !== $this->proxyInfo) {
            $res['proxy_info'] = null !== $this->proxyInfo ? $this->proxyInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddRegisterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['create_certificate'])) {
            $model->createCertificate = $map['create_certificate'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['create_package'])) {
            $model->createPackage = $map['create_package'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['works_info'])) {
            $model->worksInfo = WorksInfo::fromMap($map['works_info']);
        }
        if (isset($map['create_statement'])) {
            $model->createStatement = $map['create_statement'];
        }
        if (isset($map['manager_name'])) {
            $model->managerName = $map['manager_name'];
        }
        if (isset($map['manager_no'])) {
            $model->managerNo = $map['manager_no'];
        }
        if (isset($map['rights_info'])) {
            $model->rightsInfo = RightsInfo::fromMap($map['rights_info']);
        }
        if (isset($map['ancillary_evidence'])) {
            if (!empty($map['ancillary_evidence'])) {
                $model->ancillaryEvidence = $map['ancillary_evidence'];
            }
        }
        if (isset($map['copyright_owner_info'])) {
            $model->copyrightOwnerInfo = CopyrightCertInfo::fromMap($map['copyright_owner_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['sync_info'])) {
            $model->syncInfo = AccountData::fromMap($map['sync_info']);
        }
        if (isset($map['proxy_info'])) {
            $model->proxyInfo = ProxyData::fromMap($map['proxy_info']);
        }

        return $model;
    }
}
