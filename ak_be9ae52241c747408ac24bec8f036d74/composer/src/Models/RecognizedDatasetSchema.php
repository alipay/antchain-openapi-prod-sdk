<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class RecognizedDatasetSchema extends Model
{
    // 数据集格式类型。
    // 示例如下：
    // TABLE,
    // CSV
    /**
     * @example TABLE
     *
     * @var string
     */
    public $formatType;

    // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
    // 对应关系如下：
    // 数据表 -> TableFormatConfig，
    // CSV文件 -> CSVFormatConfig
    /**
     * @example TableFormatConfig转化成的json字符串
     *
     * @var string
     */
    public $formatConfig;

    // 数据集 schema 类型。
    /**
     * @example STRUCTURED_DATA
     *
     * @var string
     */
    public $schemaType;

    // 结构化数据 schema
    // schema_type为STRUCTURED_DATA时必填
    /**
     * @example
     *
     * @var StructuredDataSchema
     */
    public $structuredDataSchema;
    protected $_name = [
        'formatType'           => 'format_type',
        'formatConfig'         => 'format_config',
        'schemaType'           => 'schema_type',
        'structuredDataSchema' => 'structured_data_schema',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->formatType) {
            $res['format_type'] = $this->formatType;
        }
        if (null !== $this->formatConfig) {
            $res['format_config'] = $this->formatConfig;
        }
        if (null !== $this->schemaType) {
            $res['schema_type'] = $this->schemaType;
        }
        if (null !== $this->structuredDataSchema) {
            $res['structured_data_schema'] = null !== $this->structuredDataSchema ? $this->structuredDataSchema->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizedDatasetSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['format_type'])) {
            $model->formatType = $map['format_type'];
        }
        if (isset($map['format_config'])) {
            $model->formatConfig = $map['format_config'];
        }
        if (isset($map['schema_type'])) {
            $model->schemaType = $map['schema_type'];
        }
        if (isset($map['structured_data_schema'])) {
            $model->structuredDataSchema = StructuredDataSchema::fromMap($map['structured_data_schema']);
        }

        return $model;
    }
}
