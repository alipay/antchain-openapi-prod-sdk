<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class ContractSigning extends Model
{
    // 本合同文件的名称
    /**
     * @example XX公寓认购合同
     *
     * @var string
     */
    public $contractName;

    // 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
    /**
     * @example /org/file/d.pdf
     *
     * @var string
     */
    public $filePath;

    // 机构签署记录列表，可设置多个机构的签署区
    /**
     * @example
     *
     * @var OrgSigning[]
     */
    public $orgSignList;

    // 个人签署记录的列表形式，可设置多个个人的签署区
    /**
     * @example
     *
     * @var PersonalSigning[]
     */
    public $personalSignList;
    protected $_name = [
        'contractName'     => 'contract_name',
        'filePath'         => 'file_path',
        'orgSignList'      => 'org_sign_list',
        'personalSignList' => 'personal_sign_list',
    ];

    public function validate()
    {
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('orgSignList', $this->orgSignList, true);
        Model::validateRequired('personalSignList', $this->personalSignList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->orgSignList) {
            $res['org_sign_list'] = [];
            if (null !== $this->orgSignList && \is_array($this->orgSignList)) {
                $n = 0;
                foreach ($this->orgSignList as $item) {
                    $res['org_sign_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->personalSignList) {
            $res['personal_sign_list'] = [];
            if (null !== $this->personalSignList && \is_array($this->personalSignList)) {
                $n = 0;
                foreach ($this->personalSignList as $item) {
                    $res['personal_sign_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSigning
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['org_sign_list'])) {
            if (!empty($map['org_sign_list'])) {
                $model->orgSignList = [];
                $n                  = 0;
                foreach ($map['org_sign_list'] as $item) {
                    $model->orgSignList[$n++] = null !== $item ? OrgSigning::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['personal_sign_list'])) {
            if (!empty($map['personal_sign_list'])) {
                $model->personalSignList = [];
                $n                       = 0;
                foreach ($map['personal_sign_list'] as $item) {
                    $model->personalSignList[$n++] = null !== $item ? PersonalSigning::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
