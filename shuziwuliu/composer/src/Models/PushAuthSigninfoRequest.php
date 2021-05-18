<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushAuthSigninfoRequest extends Model
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

    // 签署流程id
    /**
     * @var string
     */
    public $signProcessId;

    // 授权关系类型id
    /**
     * @var string
     */
    public $authRelTypeId;

    // 某某主题
    /**
     * @var string
     */
    public $signTheme;

    // 发起方名称
    /**
     * @var string
     */
    public $initiatorName;

    // 发起方证件类型，可以填写的枚举类型：UNIFIED_SOCIAL_CREDIT_CODE,  BUSINESS_LICENSE_NUMBER。分别表示统一社会信用代码和工商注册号
    /**
     * @var string
     */
    public $initiatorCertType;

    // 发起方证件号码
    /**
     * @var string
     */
    public $initiatorCertNum;

    // 合同模板hash
    /**
     * @var string
     */
    public $contTmplHash;

    // 签署方信息列表
    /**
     * @var AuthParty[]
     */
    public $authPartys;

    // 上链文件信息列表
    /**
     * @var AuthChainFile[]
     */
    public $authChainFiles;

    // 动态字段1
    /**
     * @var string
     */
    public $dynaField1;

    // 动态字段2
    /**
     * @var string
     */
    public $dynaField2;

    // 动态字段3
    /**
     * @var string
     */
    public $dynaField3;

    // 动态字段4
    /**
     * @var string
     */
    public $dynaField4;

    // 动态字段5
    /**
     * @var string
     */
    public $dynaField5;

    // 动态字段6
    /**
     * @var string
     */
    public $dynaField6;

    // 动态字段7
    /**
     * @var string
     */
    public $dynaField7;

    // 动态字段8
    /**
     * @var string
     */
    public $dynaField8;

    // 动态字段9
    /**
     * @var string
     */
    public $dynaField9;

    // 动态字段10
    /**
     * @var string
     */
    public $dynaField10;

    // 动态字段11
    /**
     * @var string
     */
    public $dynaField11;

    // 动态字段12
    /**
     * @var string
     */
    public $dynaField12;

    // 动态字段13
    /**
     * @var string
     */
    public $dynaField13;

    // 动态字段14
    /**
     * @var string
     */
    public $dynaField14;

    // 动态字段15
    /**
     * @var string
     */
    public $dynaField15;

    // 动态字段16
    /**
     * @var string
     */
    public $dynaField16;

    // 动态字段17
    /**
     * @var string
     */
    public $dynaField17;

    // 动态字段18
    /**
     * @var string
     */
    public $dynaField18;

    // 动态字段19
    /**
     * @var string
     */
    public $dynaField19;

    // 动态字段20
    /**
     * @var string
     */
    public $dynaField20;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signProcessId'     => 'sign_process_id',
        'authRelTypeId'     => 'auth_rel_type_id',
        'signTheme'         => 'sign_theme',
        'initiatorName'     => 'initiator_name',
        'initiatorCertType' => 'initiator_cert_type',
        'initiatorCertNum'  => 'initiator_cert_num',
        'contTmplHash'      => 'cont_tmpl_hash',
        'authPartys'        => 'auth_partys',
        'authChainFiles'    => 'auth_chain_files',
        'dynaField1'        => 'dyna_field1',
        'dynaField2'        => 'dyna_field2',
        'dynaField3'        => 'dyna_field3',
        'dynaField4'        => 'dyna_field4',
        'dynaField5'        => 'dyna_field5',
        'dynaField6'        => 'dyna_field6',
        'dynaField7'        => 'dyna_field7',
        'dynaField8'        => 'dyna_field8',
        'dynaField9'        => 'dyna_field9',
        'dynaField10'       => 'dyna_field10',
        'dynaField11'       => 'dyna_field11',
        'dynaField12'       => 'dyna_field12',
        'dynaField13'       => 'dyna_field13',
        'dynaField14'       => 'dyna_field14',
        'dynaField15'       => 'dyna_field15',
        'dynaField16'       => 'dyna_field16',
        'dynaField17'       => 'dyna_field17',
        'dynaField18'       => 'dyna_field18',
        'dynaField19'       => 'dyna_field19',
        'dynaField20'       => 'dyna_field20',
    ];

    public function validate()
    {
        Model::validateRequired('signProcessId', $this->signProcessId, true);
        Model::validateRequired('authRelTypeId', $this->authRelTypeId, true);
        Model::validateRequired('initiatorName', $this->initiatorName, true);
        Model::validateRequired('initiatorCertType', $this->initiatorCertType, true);
        Model::validateRequired('initiatorCertNum', $this->initiatorCertNum, true);
        Model::validateRequired('contTmplHash', $this->contTmplHash, true);
        Model::validateRequired('authPartys', $this->authPartys, true);
        Model::validateRequired('authChainFiles', $this->authChainFiles, true);
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
        if (null !== $this->signProcessId) {
            $res['sign_process_id'] = $this->signProcessId;
        }
        if (null !== $this->authRelTypeId) {
            $res['auth_rel_type_id'] = $this->authRelTypeId;
        }
        if (null !== $this->signTheme) {
            $res['sign_theme'] = $this->signTheme;
        }
        if (null !== $this->initiatorName) {
            $res['initiator_name'] = $this->initiatorName;
        }
        if (null !== $this->initiatorCertType) {
            $res['initiator_cert_type'] = $this->initiatorCertType;
        }
        if (null !== $this->initiatorCertNum) {
            $res['initiator_cert_num'] = $this->initiatorCertNum;
        }
        if (null !== $this->contTmplHash) {
            $res['cont_tmpl_hash'] = $this->contTmplHash;
        }
        if (null !== $this->authPartys) {
            $res['auth_partys'] = [];
            if (null !== $this->authPartys && \is_array($this->authPartys)) {
                $n = 0;
                foreach ($this->authPartys as $item) {
                    $res['auth_partys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->authChainFiles) {
            $res['auth_chain_files'] = [];
            if (null !== $this->authChainFiles && \is_array($this->authChainFiles)) {
                $n = 0;
                foreach ($this->authChainFiles as $item) {
                    $res['auth_chain_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dynaField1) {
            $res['dyna_field1'] = $this->dynaField1;
        }
        if (null !== $this->dynaField2) {
            $res['dyna_field2'] = $this->dynaField2;
        }
        if (null !== $this->dynaField3) {
            $res['dyna_field3'] = $this->dynaField3;
        }
        if (null !== $this->dynaField4) {
            $res['dyna_field4'] = $this->dynaField4;
        }
        if (null !== $this->dynaField5) {
            $res['dyna_field5'] = $this->dynaField5;
        }
        if (null !== $this->dynaField6) {
            $res['dyna_field6'] = $this->dynaField6;
        }
        if (null !== $this->dynaField7) {
            $res['dyna_field7'] = $this->dynaField7;
        }
        if (null !== $this->dynaField8) {
            $res['dyna_field8'] = $this->dynaField8;
        }
        if (null !== $this->dynaField9) {
            $res['dyna_field9'] = $this->dynaField9;
        }
        if (null !== $this->dynaField10) {
            $res['dyna_field10'] = $this->dynaField10;
        }
        if (null !== $this->dynaField11) {
            $res['dyna_field11'] = $this->dynaField11;
        }
        if (null !== $this->dynaField12) {
            $res['dyna_field12'] = $this->dynaField12;
        }
        if (null !== $this->dynaField13) {
            $res['dyna_field13'] = $this->dynaField13;
        }
        if (null !== $this->dynaField14) {
            $res['dyna_field14'] = $this->dynaField14;
        }
        if (null !== $this->dynaField15) {
            $res['dyna_field15'] = $this->dynaField15;
        }
        if (null !== $this->dynaField16) {
            $res['dyna_field16'] = $this->dynaField16;
        }
        if (null !== $this->dynaField17) {
            $res['dyna_field17'] = $this->dynaField17;
        }
        if (null !== $this->dynaField18) {
            $res['dyna_field18'] = $this->dynaField18;
        }
        if (null !== $this->dynaField19) {
            $res['dyna_field19'] = $this->dynaField19;
        }
        if (null !== $this->dynaField20) {
            $res['dyna_field20'] = $this->dynaField20;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAuthSigninfoRequest
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
        if (isset($map['sign_process_id'])) {
            $model->signProcessId = $map['sign_process_id'];
        }
        if (isset($map['auth_rel_type_id'])) {
            $model->authRelTypeId = $map['auth_rel_type_id'];
        }
        if (isset($map['sign_theme'])) {
            $model->signTheme = $map['sign_theme'];
        }
        if (isset($map['initiator_name'])) {
            $model->initiatorName = $map['initiator_name'];
        }
        if (isset($map['initiator_cert_type'])) {
            $model->initiatorCertType = $map['initiator_cert_type'];
        }
        if (isset($map['initiator_cert_num'])) {
            $model->initiatorCertNum = $map['initiator_cert_num'];
        }
        if (isset($map['cont_tmpl_hash'])) {
            $model->contTmplHash = $map['cont_tmpl_hash'];
        }
        if (isset($map['auth_partys'])) {
            if (!empty($map['auth_partys'])) {
                $model->authPartys = [];
                $n                 = 0;
                foreach ($map['auth_partys'] as $item) {
                    $model->authPartys[$n++] = null !== $item ? AuthParty::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['auth_chain_files'])) {
            if (!empty($map['auth_chain_files'])) {
                $model->authChainFiles = [];
                $n                     = 0;
                foreach ($map['auth_chain_files'] as $item) {
                    $model->authChainFiles[$n++] = null !== $item ? AuthChainFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dyna_field1'])) {
            $model->dynaField1 = $map['dyna_field1'];
        }
        if (isset($map['dyna_field2'])) {
            $model->dynaField2 = $map['dyna_field2'];
        }
        if (isset($map['dyna_field3'])) {
            $model->dynaField3 = $map['dyna_field3'];
        }
        if (isset($map['dyna_field4'])) {
            $model->dynaField4 = $map['dyna_field4'];
        }
        if (isset($map['dyna_field5'])) {
            $model->dynaField5 = $map['dyna_field5'];
        }
        if (isset($map['dyna_field6'])) {
            $model->dynaField6 = $map['dyna_field6'];
        }
        if (isset($map['dyna_field7'])) {
            $model->dynaField7 = $map['dyna_field7'];
        }
        if (isset($map['dyna_field8'])) {
            $model->dynaField8 = $map['dyna_field8'];
        }
        if (isset($map['dyna_field9'])) {
            $model->dynaField9 = $map['dyna_field9'];
        }
        if (isset($map['dyna_field10'])) {
            $model->dynaField10 = $map['dyna_field10'];
        }
        if (isset($map['dyna_field11'])) {
            $model->dynaField11 = $map['dyna_field11'];
        }
        if (isset($map['dyna_field12'])) {
            $model->dynaField12 = $map['dyna_field12'];
        }
        if (isset($map['dyna_field13'])) {
            $model->dynaField13 = $map['dyna_field13'];
        }
        if (isset($map['dyna_field14'])) {
            $model->dynaField14 = $map['dyna_field14'];
        }
        if (isset($map['dyna_field15'])) {
            $model->dynaField15 = $map['dyna_field15'];
        }
        if (isset($map['dyna_field16'])) {
            $model->dynaField16 = $map['dyna_field16'];
        }
        if (isset($map['dyna_field17'])) {
            $model->dynaField17 = $map['dyna_field17'];
        }
        if (isset($map['dyna_field18'])) {
            $model->dynaField18 = $map['dyna_field18'];
        }
        if (isset($map['dyna_field19'])) {
            $model->dynaField19 = $map['dyna_field19'];
        }
        if (isset($map['dyna_field20'])) {
            $model->dynaField20 = $map['dyna_field20'];
        }

        return $model;
    }
}
