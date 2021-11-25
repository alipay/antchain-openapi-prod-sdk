<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class BandCert extends Model
{
    // 银行账号
    //
    //
    /**
     * @example 银行账号
     *
     * @var string
     */
    public $bankAccount;

    // 银行名称
    //
    //
    /**
     * @example 银行名称
     *
     * @var string
     */
    public $bankName;

    // 文件信息，支持上传多个文件
    //
    //
    /**
     * @example 文件信息，支持上传多个文件
     *
     * @var FileDefine[]
     */
    public $fileDefines;
    protected $_name = [
        'bankAccount' => 'bank_account',
        'bankName'    => 'bank_name',
        'fileDefines' => 'file_defines',
    ];

    public function validate()
    {
        Model::validateRequired('bankAccount', $this->bankAccount, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('fileDefines', $this->fileDefines, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->fileDefines) {
            $res['file_defines'] = [];
            if (null !== $this->fileDefines && \is_array($this->fileDefines)) {
                $n = 0;
                foreach ($this->fileDefines as $item) {
                    $res['file_defines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BandCert
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bank_account'])) {
            $model->bankAccount = $map['bank_account'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['file_defines'])) {
            if (!empty($map['file_defines'])) {
                $model->fileDefines = [];
                $n                  = 0;
                foreach ($map['file_defines'] as $item) {
                    $model->fileDefines[$n++] = null !== $item ? FileDefine::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
