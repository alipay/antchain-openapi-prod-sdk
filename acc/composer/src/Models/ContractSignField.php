<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignField extends Model
{
    // account_id
    /**
     * @example account_id
     *
     * @var string
     */
    public $accountId;

    // file_id
    /**
     * @example file_id
     *
     * @var string
     */
    public $fileId;

    // signfield_id
    /**
     * @example signfield_id
     *
     * @var string
     */
    public $signfieldId;
    protected $_name = [
        'accountId'   => 'account_id',
        'fileId'      => 'file_id',
        'signfieldId' => 'signfield_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('signfieldId', $this->signfieldId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->signfieldId) {
            $res['signfield_id'] = $this->signfieldId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['signfield_id'])) {
            $model->signfieldId = $map['signfield_id'];
        }

        return $model;
    }
}
