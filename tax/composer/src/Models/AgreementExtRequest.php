<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AgreementExtRequest extends Model
{
    // 证书类型
    /**
     * @example 证书类型
     *
     * @var string
     */
    public $type;

    // 是否盖章，true：是 false：否
    /**
     * @example true
     *
     * @var string
     */
    public $isSeal;

    // 地址
    /**
     * @example http://sdsdfsd.com
     *
     * @var string
     */
    public $address;

    // 授权文件信息
    /**
     * @example
     *
     * @var AgreementFile
     */
    public $agreementFile;
    protected $_name = [
        'type'          => 'type',
        'isSeal'        => 'is_seal',
        'address'       => 'address',
        'agreementFile' => 'agreement_file',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('isSeal', $this->isSeal, true);
        Model::validateRequired('address', $this->address, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->isSeal) {
            $res['is_seal'] = $this->isSeal;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->agreementFile) {
            $res['agreement_file'] = null !== $this->agreementFile ? $this->agreementFile->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementExtRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['is_seal'])) {
            $model->isSeal = $map['is_seal'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['agreement_file'])) {
            $model->agreementFile = AgreementFile::fromMap($map['agreement_file']);
        }

        return $model;
    }
}
