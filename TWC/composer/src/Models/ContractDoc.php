<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractDoc extends Model
{
    // 上传的电子合同文档是否被加密过，0-未被加密，1-被加密过，默认0
    /**
     * @example 1,0
     *
     * @var int
     */
    public $encryption;

    // 电子合同文档的ID
    /**
     * @example 01e50a9cedb74493a2d320b4f4732a29
     *
     * @var string
     */
    public $fileId;

    // 电子合同文档名称，默认文件名称
    /**
     * @example 第一份合同.pdf
     *
     * @var string
     */
    public $fileName;

    // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
    /**
     * @example mypassword
     *
     * @var string
     */
    public $filePassword;
    protected $_name = [
        'encryption'   => 'encryption',
        'fileId'       => 'file_id',
        'fileName'     => 'file_name',
        'filePassword' => 'file_password',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->encryption) {
            $res['encryption'] = $this->encryption;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->filePassword) {
            $res['file_password'] = $this->filePassword;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractDoc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['encryption'])) {
            $model->encryption = $map['encryption'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_password'])) {
            $model->filePassword = $map['file_password'];
        }

        return $model;
    }
}
