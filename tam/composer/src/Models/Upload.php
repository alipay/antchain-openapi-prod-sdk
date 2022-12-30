<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class Upload extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $endpoint;

    /**
     * @example
     *
     * @var string
     */
    public $fileUniqueId;

    /**
     * @example
     *
     * @var string
     */
    public $fileUrl;

    /**
     * @example
     *
     * @var FormParam
     */
    public $formParam;
    protected $_name = [
        'endpoint'     => 'endpoint',
        'fileUniqueId' => 'file_unique_id',
        'fileUrl'      => 'file_url',
        'formParam'    => 'form_param',
    ];

    public function validate()
    {
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('fileUniqueId', $this->fileUniqueId, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('formParam', $this->formParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->fileUniqueId) {
            $res['file_unique_id'] = $this->fileUniqueId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->formParam) {
            $res['form_param'] = null !== $this->formParam ? $this->formParam->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Upload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['file_unique_id'])) {
            $model->fileUniqueId = $map['file_unique_id'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['form_param'])) {
            $model->formParam = FormParam::fromMap($map['form_param']);
        }

        return $model;
    }
}
