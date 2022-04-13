<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetUnireleaseSolutionfileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // Sftp目录：/sftp/linkw/unionpay/date/id/prod/timestamp-solution.json
    //
    /**
     * @var string
     */
    public $filePath;
    protected $_name = [
        'authToken' => 'auth_token',
        'filePath'  => 'file_path',
    ];

    public function validate()
    {
        Model::validateRequired('filePath', $this->filePath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUnireleaseSolutionfileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }

        return $model;
    }
}
